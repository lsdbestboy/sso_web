package com.tiger.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.client.RestTemplate;

import com.tiger.common.pojo.ClggResult;
import com.tiger.common.pojo.SMSResult;
import com.tiger.dao.JedisClient;
import com.tiger.dao.SystemUserMapper;
import com.tiger.model.SystemUser;
import com.tiger.model.SystemUserExample;
import com.tiger.model.SystemUserExample.Criteria;
import com.tiger.service.UserService;
import com.tiger.utils.CookieUtils;
import com.tiger.utils.JsonUtils;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private SystemUserMapper userMapper;
	@Autowired
	private JedisClient jedisClient;
	
	@Value("${REDIS_USER_SESSION_KEY}")
	private String REDIS_USER_SESSION_KEY;
	
	@Value("${SSO_SESSION_EXPIRE}")
	private Integer SSO_SESSION_EXPIRE;
	
	@Value("${SMS_URL}")
	private String SMS_URL;
	
	@Value("${CONTENT}")
	private String SMS_BASE_CONTENT;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public ClggResult checkData(String content, Integer type) {
		//创建查询条件
		SystemUserExample example = new SystemUserExample();
	    Criteria criteria = example.createCriteria();
		//对数据进行校验：1、2、3分别代表username、phone、email
		//用户名校验
		if (1 == type) {
			criteria.andUserNameEqualTo(content);
		//电话校验
		} else if (2 == type) {
			criteria.andPersonalPhoneEqualTo(content);
		//email校验
		} else {
			criteria.andEmailEqualTo(content);
		}
		//执行查询
		List<SystemUser> list = userMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return ClggResult.ok();
		}
		return ClggResult.build(false, "数据已经存在");
	}

	@Override
	public ClggResult addUser(SystemUser user) {
		UUID uuid = UUID.randomUUID();
		String str = uuid.toString();

		// 去掉"-"符号
		String id = str.substring(0, 8) + str.substring(9, 13) + str.substring(14, 18) + str.substring(19, 23)
				+ str.substring(24);
		user.setId(id);

		// 生成随机数
		user.setPasswordSalt(com.tiger.utils.RandomUtils.generateString(20));

		// 组合加密
		String pwd = user.getPassword() + user.getPasswordSalt();

		// MD5 加密
		user.setPassword(DigestUtils.md5DigestAsHex(pwd.getBytes()));

		user.setCreatedTime(new Date());
		userMapper.insert(user);
		return ClggResult.ok();
	}

	@Override
	public ClggResult userLogin(String username, String password, HttpServletRequest request,
			HttpServletResponse response) {

		SystemUser systemUser = userMapper.checkUserIsExist(username);
		
		if (systemUser == null) //用户名或密码不存在
			return ClggResult.build(false, "用户名或密码错误");
		
		// 密码比对
		StringBuffer sb = new StringBuffer(password);
		sb.append(systemUser.getPasswordSalt());
		if (!DigestUtils.md5DigestAsHex(sb.toString().getBytes()).equals(systemUser.getPassword())) {
			return ClggResult.build(false, "用户名或密码错误");
		}
		//生成 token
		String token = UUID.randomUUID().toString();
		systemUser.setPassword(null);//清空密码
		systemUser.setPasswordSalt(null);//清空密码盐
		//把用户信息写入redis
		jedisClient.set(REDIS_USER_SESSION_KEY + ":" + token, JsonUtils.objectToJson(systemUser));
		//设置session的过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		
		//车队店铺 卡车购  DTMS整合
		//CookieUtils.setCookie(request, response, "CLGG_TOKEN", token);
		//卡车购 
		CookieUtils.setCookie(request, response, "KCG_TOKEN", token);
		//返回token
		return ClggResult.ok(token);
	}

	@Override 
	public ClggResult getUserByToken(String token) {
		//根据token从redis中查询用户信息
		String json = jedisClient.get(REDIS_USER_SESSION_KEY + ":" + token);
		//判断是否为空
		if (StringUtils.isBlank(json)) {
			return ClggResult.build(false, "此session已经过期，请重新登录");
		}
		//更新过期时间
		jedisClient.expire(REDIS_USER_SESSION_KEY + ":" + token, SSO_SESSION_EXPIRE);
		//返回用户信息
		return ClggResult.ok(JsonUtils.jsonToPojo(json, SystemUser.class));
	}

	@Override
	public ClggResult userLogout(String token, HttpServletRequest request, HttpServletResponse response) {
		CookieUtils.deleteCookie(request, response, token);
		jedisClient.del(REDIS_USER_SESSION_KEY + ":" + token);
		return ClggResult.ok();
	}

	@Override
	public ClggResult sendCheckCode(String phone) {
		// 缓存验证码标识
		
		String vCode = jedisClient.get(phone);
		
		// 缓存中如果没有的话,则添加
		if (StringUtils.isBlank(vCode)) {
			vCode = RandomStringUtils.randomNumeric(6);
			jedisClient.set(phone, vCode);
		}
		
		Map<String, String> param = new HashMap<>();
		param.put("mobile", phone);
		param.put("content", SMS_BASE_CONTENT + vCode + ",个人隐私信息，请注意保密,谢谢");
		try {
			SMSResult smsResult = restTemplate.getForObject(SMS_URL, SMSResult.class, param);
			return ClggResult.build(smsResult.isStatus(), smsResult.getMessage());
		} catch (Exception e) {
			return ClggResult.build(false, e.getMessage());
		}
	}

	@Override
	public ClggResult validateCode(String phone, String code) {
		// 获取对应的短信验证码
		String vCode = jedisClient.get(phone);
		if (vCode != null && vCode.equals(code)) {
			//清除验证码
			jedisClient.del(phone);
			return ClggResult.ok();
		}
		return ClggResult.build(false, "短信验证码校验失败, 请输入正确验证码");
	}

	@Override
	public SystemUser checkUserIsExist(String user) {
		return userMapper.checkUserIsExist(user);
	}

	@Override
	public ClggResult resetPassword(String userName, String password) {
		try {
			SystemUser systemUser = userMapper.checkUserIsExist(userName);
			// 组合加密
			String pwd = password + systemUser.getPasswordSalt();
			// MD5 加密
			systemUser.setPassword(DigestUtils.md5DigestAsHex(pwd.getBytes()));
			userMapper.updateByPrimaryKeySelective(systemUser);
		} catch (Exception e) {
			e.printStackTrace();
			return ClggResult.build(false, "密码重置失败,请稍后再试");
		}
		return ClggResult.ok();
	}
}
