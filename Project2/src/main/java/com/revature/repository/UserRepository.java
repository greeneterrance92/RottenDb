package com.revature.repository;

import java.util.List;

import com.revature.model.Users;

public interface UserRepository {
	
	public List<Users> getAllUsers();
	public Users getUserByUsername(String Username);
	public void insertUser(Users user);
	public void updateUser(Users user);
	public void deleteUser(Users user);

}
