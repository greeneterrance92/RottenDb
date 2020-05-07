package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repository.UsersRepository;

@Service("userService")
public class UsersService {
	
	@Autowired
	private UsersRepository usersRepository;
	
	public List<Users> getAllUsers() {
		return this.usersRepository.findAll();
	}
	
	public Users getUsersByUsername(String username) {
		Users user = this.usersRepository.findUsersByUsername(username);
		return user;
	}
	
	public Users getUsersById(int id) {
		return this.usersRepository.findUsersByUsersid(id);
	}
	
	public void addUsers(Users user) {
		this.usersRepository.save(user);
	}

}
