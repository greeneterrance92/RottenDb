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

import com.revature.model.Movies;
import com.revature.service.MoviesService;

@RestController("moviesController")
@RequestMapping("/movies")
public class MoviesController {

	@Autowired
	private MoviesService moviesService;
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movies> getAllMovies(){
		return this.moviesService.getAllMovies();
	}
	
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movies> getMoviesByID(@PathVariable int id){
		
		Movies movie = this.moviesService.getMovieById(id);
		
//		if(p == null) throw new NonexistentPolkamanException();
		
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}

}
