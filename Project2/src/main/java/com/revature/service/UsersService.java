package com.revature.service;

import java.util.List;

import com.revature.model.Users;
import com.revature.repository.UserRepository;

public class UsersService {

	UserRepository ur;
	
	public List<Users> getAllUsers() {
		return this.ur.getAllUsers();
	}
	
	public Users getUserByUsername(String Username) {
		return this.ur.getUserByUsername(Username);
	}
	
	public void insertUser(Users user) {
		this.ur.insertUser(user);
	}
	
	public void updateUser(Users user) {
		this.ur.updateUser(user);
	}
	
	public void deleteUser(Users user) {
		this.ur.deleteUser(user);
	}
}
