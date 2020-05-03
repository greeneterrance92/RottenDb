package com.revature.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Scream;
import com.revature.service.ScreamService;

@RestController("screamController")
@RequestMapping(path="/scream")
public class ScreamController {

	ScreamService screamService;
	
	public ScreamController(ScreamService screamService) {
		this.screamService = screamService;
	}
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Scream> getAllScreams(){
		return this.screamService.getAllScreams();
	}

	
}
