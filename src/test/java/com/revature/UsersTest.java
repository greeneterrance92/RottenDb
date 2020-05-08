package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.model.Users;
import com.revature.repository.UsersRepository;



@RunWith(SpringJUnit4ClassRunner.class)
@TestInstance(Lifecycle.PER_CLASS)
@SpringBootTest
class UsersTest {
	
	
	@MockBean
	private UsersRepository usersRepository;
	
	List<Users> users = new ArrayList<>();
	Users user;
	
	@BeforeAll
	public void setUp() {
		
		users.add(new Users(1, "Someting", "Friend"));
		users.add(new Users(2, "Stephanie", "Polanski"));
		
		user = new Users(3, "Table", "Chair");

		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllUsers() {
			List<Users> u = Arrays.asList(new Users(4, "Connor", "Pass"),
										  new Users(5, "Lebron", "Gems"),
										  new Users(6, "Harry", "Potter"));

			Mockito.when(usersRepository.findAll()).thenReturn(u);
			Assertions.assertEquals("Lebron", u.get(1).getUsername());
			Assertions.assertEquals("Pass", u.get(0).getPass());
		}
	
	@Test
	public void testGetUserByUsername() {
		Users c = new Users(7, "Chris", "Evans");

		Mockito.when(usersRepository.findUsersByUsername("Chris")).thenReturn(c);
		Assertions.assertEquals("Evans", c.getPass());
	}

	@Test
	public void testInsertUser() {
		users.add(new Users(8, "SomeGuy", "Something"));

		Assertions.assertEquals("Something", users.get(2).getPass());
	}
	
	@Test
	public void testUpdateUser() {
		user.setPass("Password");
		user.setUsername("Person");
		
		Assertions.assertEquals("Password", user.getPass());
	}
	
	@Test
	public void testDeleteUser() {
		users.remove(0);
		
		Assertions.assertEquals(2, users.size());
	}
}
