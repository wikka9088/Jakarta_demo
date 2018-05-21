package com.demo.dao;

import com.demo.entity.User;

public interface UserDAOInterface {
	public void addUser(User user);
	
	public User getUserByNameAndPassword(String uname, String upwd);
	
	public void updateAvatar(String id, String avatar);
}
