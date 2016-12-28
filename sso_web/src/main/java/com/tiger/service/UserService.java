package com.tiger.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tiger.common.pojo.ClggResult;
import com.tiger.model.SystemUser;

public interface UserService {

	ClggResult checkData(String content, Integer type);
	ClggResult addUser(SystemUser user);
	ClggResult userLogin(String username, String password, HttpServletRequest request, HttpServletResponse response);
	ClggResult getUserByToken(String token);
	ClggResult userLogout(String token, HttpServletRequest request, HttpServletResponse response);
	ClggResult sendCheckCode(String phone);
	ClggResult validateCode(String phone, String code);
	SystemUser checkUserIsExist(String user);
	ClggResult resetPassword(String userName, String password);
}
