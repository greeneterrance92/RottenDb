package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Users;
import com.revature.repository.UsersRepository;

@Service("userService")
public class UsersService {
	
	@Autowired
	private UsersRepository userRepository;
	
	public List<Users> getAllUsers() {
		return this.userRepository.findAll();
	}
	
	public Users getUsersByUsername(String username) {
		return this.userRepository.findUsersByUsername(username);
	}
	
	public Users getUsersById(int id) {
		return this.userRepository.findUsersByUsersid(id);
	}

}
