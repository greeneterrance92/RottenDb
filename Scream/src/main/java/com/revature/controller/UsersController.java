package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Users;
import com.revature.service.UsersService;

@RestController("usersController")
@RequestMapping("/user")
public class UsersController {

	@Autowired
	private UsersService usersService;
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getAllUsers(){
		List<Users> usersList = this.usersService.getAllUsers();
		return usersList;
	}
	
	@GetMapping(path = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> getUsersByName(@PathVariable String name){
		
		Users user = this.usersService.getUsersByUsername(name);
		
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
	
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Users> getUsersById(@PathVariable int id){
		
		Users user = this.usersService.getUsersById(id);
		
		
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

}
