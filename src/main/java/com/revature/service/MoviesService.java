package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Movies;
import com.revature.repository.MoviesRepository;

@Service("moviesService")
public class MoviesService {

	@Autowired
	MoviesRepository moviesRepository;
	
	public List<Movies> getAllMovies() {
		return this.moviesRepository.findAll();
	}
	
	/*public Movies getMovieById(int i) {
		return this.moviesRepository.findById(i);
	}*/
	
	public List<Movies> getMovieByName(String moviename) {
		return this.moviesRepository.findByMoviename(moviename);
	}
	
	public void addMovie(Movies m) {
		this.moviesRepository.save(m);
	}
	
	public void deleteMovie(Movies movie) {
		this.moviesRepository.delete(movie);
	}
	
	public boolean exists(String moviename) {
		return this.moviesRepository.existsByMoviename(moviename);
	}
}
