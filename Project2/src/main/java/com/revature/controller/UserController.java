package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Users;
import com.revature.service.UsersService;

@RestController("userController") // RestController = Controller + ResponseBody
@RequestMapping(path = "/user")
public class UserController {

	private UsersService userService;

	@Autowired // Autowired in dependency using constructor injection.
	public UserController(UsersService userService) {
		this.userService = userService;
	}

	@GetMapping(path = "/allusers", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Users> getAllUsers() {
		return this.userService.getAllUsers();
	}
	
	@GetMapping(path = "/username", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Users> getUserByUsername(@RequestParam String Username) {

		return new ResponseEntity<>(this.userService.getUserByUsername(Username), HttpStatus.OK);
	}

	@PostMapping(path = "/newuser", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void insertUser(@RequestBody Users user) {
		this.userService.insertUser(user);
	}
	
	@PutMapping(path = "/user/username", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void updateUser(@RequestBody Users user) {
		this.userService.updateUser(user);
	}

	@DeleteMapping(path = "/user/delete", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public void deleteUser(@RequestBody Users user) {
		this.userService.deleteUser(user);
	}

}
