package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Movies;

@Repository("moviesRepository")
public interface MoviesRepository extends JpaRepository<Movies, Integer> {

	List<Movies> findAll();
//	Movies findById(int i);
	List<Movies> findByMoviename(String moviename);
	//<S extends Movies> S save(Movies movie);
	void delete(Movies movie);
	boolean existsByMoviename(String moviename);
	
}
