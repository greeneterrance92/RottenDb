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
	
	public Movies getMovieById(int i) {
		return this.moviesRepository.findById(i);
	}
}
