package com.revature.controllers;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import com.revature.dao.UserDao;
import com.revature.models.User;

@RunWith(MockitoJUnitRunner.class)
public class UserControllerTest {
	
	@Mock
	UserDao userDao;
	
	UserController userController;
	
	@Before
	public void setup() {
		// Alternative Mocking config step
		Mockito.mock(UserDao.class);
		this.userController = new UserController(this.userDao);
	}
	
	@Test
	public void testEmptyOptionalReturn() {
		// Stub the mocked userDao to dictate what it should return when called
		when(userDao.getUserById(1)).thenReturn(Optional.empty());
		String result = this.userController.getUser(1);
		assertEquals("404", result);	
	}
	
	@Test
	public void testOK() {
		// Stub the mocked userDao to dictate what it should return when called
		when(userDao.getUserById(1)).thenReturn(Optional.of(new User()));
		String result = this.userController.getUser(1);
		assertEquals("OK", result);	
	}
}
