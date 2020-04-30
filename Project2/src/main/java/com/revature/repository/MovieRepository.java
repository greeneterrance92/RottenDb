package com.revature.repository;

import java.util.List;

import com.revature.model.Movies;
import com.revature.model.Reviews;

public interface MovieRepository {
	public List<Movies> getAllMovies();
	public Movies getMovieById(int movieid);
	public void insertMovie(Movies movie);
	public void updateMovies(Movies movie);
	public void deleteMovies(Movies movie);

}
