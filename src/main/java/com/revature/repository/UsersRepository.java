package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Users;

@Repository("userRepository")
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	List<Users> findAll();
	Users findUsersByUsername(String username);
	Users findUsersByUsersid(int id);
}
