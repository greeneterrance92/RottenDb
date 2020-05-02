package com.revature.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.revature.service.UsersService;

//This annotation is used to specify that this class shall return beans that will be placed in the IOC container.
@Configuration
public class BeanConfiguration {

	@Bean(value = "userService") //This method returns a bean!
	public UsersService getUsersService() {
		return new UsersService();
	}
}

