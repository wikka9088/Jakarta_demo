package com.demo.service.impl;

import com.demo.dao.UserDAOInterface;
import com.demo.entity.User;
import com.demo.service.UserServiceInterface;

public class UserServiceImpl implements UserServiceInterface {
	private UserDAOInterface userDao;
	

	@Override
	public void register(User user) {
		userDao.addUser(user);
	}

	@Override
	public User login(String uname, String upwd) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	public UserDAOInterface getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAOInterface userDao) {
		this.userDao = userDao;
	}
	
	

}
