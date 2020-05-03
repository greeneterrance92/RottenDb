package com.revature;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.revature.service.MoviesService;
import com.revature.service.UsersService;

@SpringBootApplication
public class P2TestApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(P2TestApplication.class, args);

	}

	
}
