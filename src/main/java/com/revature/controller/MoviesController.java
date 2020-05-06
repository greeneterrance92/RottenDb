package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Movies;
import com.revature.service.MoviesService;

@RestController("moviesController")
@RequestMapping("/movies")
@CrossOrigin
public class MoviesController {

	@Autowired
	private MoviesService moviesService;
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Movies> getAllMovies(){
		List<Movies> moviesList = this.moviesService.getAllMovies();
		return moviesList;
	}
	
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Movies> getMoviesByID(@PathVariable int id){
		
		Movies movie = this.moviesService.getMovieById(id);
		
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}
	
	@GetMapping(path = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Movies>> getMoviesByName(@PathVariable String name){
		
		List<Movies> movie = this.moviesService.getMovieByName(name);
		
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertMovie(@RequestBody Movies movie) {
		this.moviesService.addMovie(movie);
	}

	@GetMapping(path = "/exists/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> exists(@PathVariable String name){
		
		boolean movie= this.moviesService.exists(name);
		
		return new ResponseEntity<>(movie, HttpStatus.OK);
	}

}
