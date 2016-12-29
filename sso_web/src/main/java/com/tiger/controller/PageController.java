package com.tiger.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tiger.model.SystemUser;
import com.tiger.service.UserService;

@Controller
@RequestMapping("page")
public class PageController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("resetPasswordStepOfOne")
	public String resetPasswordStepOfOne(String redirect, Model model){
		model.addAttribute("redirect", redirect);
		return "reset_password/reset_password_step_of_one";
	}
	
	@RequestMapping("resetPasswordStepOfTwo")
	public String resetPasswordStepOfTwo(String user, Model model, String redirect) {
		SystemUser systemUser = userService.checkUserIsExist(user);
		model.addAttribute("phone", systemUser.getPersonalPhone());
		model.addAttribute("redirect", redirect);
		return "reset_password/reset_password_step_of_two";
	}
	
	@RequestMapping("resetPasswordSuccessed")
	public String resetPasswordSuccessed(String redirect, Model model) {
		model.addAttribute("redirect", redirect);
		return "reset_password/reset_password_successed";
	}
	
}

