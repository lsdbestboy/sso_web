package com.tiger.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tiger.common.pojo.ClggResult;
import com.tiger.model.SystemUser;
import com.tiger.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/check/{param}/{type}")
	@ResponseBody
	public Object checkData(@PathVariable String param, @PathVariable Integer type, String callback) {
		
		ClggResult result = null;
		//参数有效性校验
		if (StringUtils.isBlank(param)) {
			result = ClggResult.build(false, "校验内容不能为空");
		}
		if (type == null) {
			result = ClggResult.build(false, "校验内容类型不能为空");
		}
		if (type != 1 && type != 2 && type != 3 ) {
			result = ClggResult.build(false, "校验内容类型错误");
		}
		//校验出错
		if (null != result) {
			if (null != callback) {
				MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
				mappingJacksonValue.setJsonpFunction(callback);
				return mappingJacksonValue;
			} else {
				return result; 
			}
		}
		//调用服务
		try {
			param = URLDecoder.decode(param, "UTF-8");  
			result = userService.checkData(param, type);
		} catch (Exception e) {
			result = ClggResult.build(false, e.getMessage());
		}
		if (null != callback) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		} else {
			return result; 
		}
	}
	
	/**
	 * 用户注册
	 * @param user
	 * @return ClggResult
	 */
	@RequestMapping(value = "register", method = RequestMethod.POST)
	@ResponseBody
	public ClggResult registerUser(SystemUser user){
		try {
			return userService.addUser(user);
		} catch(Exception e){
			return ClggResult.build(false, e.getMessage());
		}
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @param request
	 * @param response
	 * @return ClggResult
	 */
	@RequestMapping(value = "login", method = RequestMethod.POST)
	@ResponseBody
	public ClggResult userLogin(SystemUser user, HttpServletRequest request, HttpServletResponse response) {
		try {
			return userService.userLogin(user.getUserName(), user.getPassword(), request, response);
		} catch (Exception e) {
			return ClggResult.build(false, e.getMessage());
		}
	}
	
	/**
	 * 用户退出
	 * @param user
	 * @param request
	 * @param response
	 * @return ClggResult
	 */
	@RequestMapping(value = "logout/{token}")
	@ResponseBody
	public Object userlogout(@PathVariable("token")String token, HttpServletRequest request, HttpServletResponse response, String callback) {
		ClggResult result = null;
		try {
			result= userService.userLogout(token, request, response);
		} catch (Exception e) {
			return ClggResult.build(false, e.getMessage());
		}
		if (StringUtils.isNotBlank(callback)) {//是否需要执行回调函数
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
		return result;
	}
	
	/**
	 * 根据token获取用户登录信息
	 * @param token token值
	 * @param callback 回调函数
	 * @return Object ClggResult或者 MappingJacksonValue 用户对象
	 */
	@RequestMapping(value = "userInfo/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable("token") String token, String callback) {
		ClggResult result = null;
		try {
			result =  userService.getUserByToken(token);
		} catch (Exception e) {
			result = ClggResult.build(false, e.getMessage());
		}
		if (StringUtils.isNotBlank(callback)) {//是否需要执行回调函数
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
		return result;
	}
	
	@RequestMapping("page/{pageType}")
	public String toPage(@PathVariable("pageType")String pageType, String redirect, Model model){
		model.addAttribute("redirect", redirect);
		return pageType;
	}
	
	@RequestMapping("sendCheckCode/{phone}")
	@ResponseBody
	public Object checkCode(@PathVariable("phone")String phone,  Model model){
		return userService.sendCheckCode(phone);
	}
	
	@RequestMapping("validateCode/{phone}/{code}")
	@ResponseBody
	public Object validateCode(@PathVariable("phone")String phone,  @PathVariable("code") String code, Model model){
		return userService.validateCode(phone, code);
	}
	
	@RequestMapping(value="resetPassword", method = RequestMethod.POST)
	@ResponseBody
	public ClggResult resetPassword(String userName, String password){
		return userService.resetPassword(userName, password);
	}
	@RequestMapping("checkUser/{user}")
	@ResponseBody
	public ClggResult checkUser(@PathVariable("user")String user){
		try {
			SystemUser resultUser = userService.checkUserIsExist(URLDecoder.decode(user, "UTF-8"));
			if (resultUser != null) {
				return ClggResult.ok();// 存在
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return ClggResult.build(false, "系统错误,请稍后再试");
		}
		
		return ClggResult.build(false, "不存在");
	}
}
