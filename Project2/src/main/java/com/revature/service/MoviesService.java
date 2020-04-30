package com.revature.service;

import java.util.List;

import com.revature.model.Movies;
import com.revature.model.Reviews;
import com.revature.repository.MovieRepository;

public class MoviesService {
	MovieRepository mr;
	
	public List<Movies> getAllMovies() {
		return this.mr.getAllMovies();
	}
	
	public Movies getMovieById(int movieid) {
		return this.mr.getMovieById(movieid);
	}
	
	public void insertMovie(Movies movie) {
		mr.insertMovie(movie);
	}
		
	public void updateMovies(Movies movie) {
		mr.updateMovies(movie);
	}
		
	public void deleteMovies(Movies movie) {
		mr.deleteMovies(movie);
	}
}
