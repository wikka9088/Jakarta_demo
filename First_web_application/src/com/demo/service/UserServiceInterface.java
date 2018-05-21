package com.demo.service;

import com.demo.entity.User;

public interface UserServiceInterface {
	public void register(User user);
	
	public User login(String uname, String upwd);
}
