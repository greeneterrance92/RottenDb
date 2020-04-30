package com.revature.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import com.revature.model.Users;
import com.revature.repository.UserRepositoryImpl;


@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
class UsersTest {
	
	
	@Mock
	UserRepositoryImpl ur;
	List<Users> users = new ArrayList<>();
	Users user;
	
	@BeforeAll
	public void setUp() {
		ur = new UserRepositoryImpl();
		
		users.add(new Users("Someting", "Friend"));
		users.add(new Users("Stephanie", "Polanski"));
		
		user = new Users("Table", "Chair");

		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllUsers() {
			List<Users> u = Arrays.asList(new Users("Connor", "Pass"),
										  new Users("Lebron", "Gems"),
										  new Users("Harry", "Potter"));

			Mockito.when(ur.getAllUsers()).thenReturn(u);
			Assertions.assertEquals("Lebron", u.get(1).getUsername());
			Assertions.assertEquals("Pass", u.get(0).getPassword());
		}
	
	@Test
	public void testGetUserByUsername() {
		Users c = new Users("Chris", "Evans");

		Mockito.when(ur.getUserByUsername("Chris")).thenReturn(c);
		Assertions.assertEquals("Evans", c.getPassword());
	}

	@Test
	public void testInsertUser() {
		users.add(new Users("SomeGuy", "Something"));

		Assertions.assertEquals("Something", users.get(2).getPassword());
	}
	
	@Test
	public void testUpdateUser() {
		user.setPassword("Password");
		user.setUsername("Person");
		
		Assertions.assertEquals("Password", user.getPassword());
	}
	
	@Test
	public void testDeleteUser() {
		users.remove(0);
		
		Assertions.assertEquals(2, users.size());
	}
}
