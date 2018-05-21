package com.demo.web;

import com.demo.entity.User;
import com.demo.service.UserServiceInterface;

public class UserAction {
	//java bean style;
	private UserServiceInterface UserService;
	private User user;
	
	
	public String registerAction() {
		UserService.register(user);
		
		return "register success";
	}


	
	/*
	 * Getter and Setter
	 * */
	public UserServiceInterface getUserService() {
		return UserService;
	}


	public void setUserService(UserServiceInterface userService) {
		UserService = userService;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
}
