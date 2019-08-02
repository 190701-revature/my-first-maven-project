package com.revature.controllers;

import java.util.Optional;

import com.revature.dao.UserDao;
import com.revature.models.User;

public class UserController {
	private UserDao userDao;

	public UserController(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	public String getUser(int id) {
		Optional<User> user = this.userDao.getUserById(id);
		// If we get the user return OK
		// if we get nothing return 404
		
		if(user.isPresent()) {
			return "OK";
		} else {
			return "404";
		}
	}
	
}
