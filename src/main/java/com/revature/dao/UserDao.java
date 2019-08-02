package com.revature.dao;

import java.util.Optional;

import com.revature.models.User;

public interface UserDao {
	Optional<User> getUserById(int id);
}
