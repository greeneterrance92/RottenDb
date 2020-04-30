package com.revature.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.model.Movies;
import com.revature.model.Reviews;
import com.revature.repository.MovieRepositoryImpl;
import com.revature.repository.ReviewRepositoryImpl;

@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)

public class moviesTest {
	

	@Mock
	MovieRepositoryImpl mr;
	List<Movies> movies = new ArrayList<>();
	Movies movie;
	
	@BeforeAll
	public void setUp() {
		mr = new MovieRepositoryImpl();
		
		movies.add(new Movies(1, "First Movie"));
		movies.add(new Movies(2, "Second Movie"));
		System.out.println(movies.size());
		movie = new Movies(4, "Fourth Movie");
		
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testGetAllMovies() {
		
		List<Movies> c = Arrays.asList(new Movies(1, "First Movie"),
				new Movies(2, "Second Movie"));
										
		Mockito.when(mr.getAllMovies()).thenReturn(c);
		Assertions.assertEquals(1, c.get(0).getMovieId());
		Assertions.assertEquals("Second Movie", c.get(1).getMovieName());
	}

	@Test 
	public void testGetMovieById() {
	Movies c = new Movies(1, "First Movie");
	Mockito.when(mr.getMovieById(1)).thenReturn(c);
	Assertions.assertEquals("First Movie", c.getMovieName());
	}
	
	@Test 
	public void testInsertReview() {
		movies.add(new Movies(1, "First Movie"));
		System.out.println(movies.get(0).getMovieName());
		Assertions.assertEquals("Second Movie", movies.get(0).getMovieName());
	}
	
	@Test
	public void testUpdateMovie() {
		movie.setMovieName("3rd Movie");
		
		
		Assertions.assertEquals("3rd Movie", movie.getMovieName());
		
	}
	
	@Test
	public void testDeleteReview() {
		movies.remove(0);
		System.out.println(movies.size());
		Assertions.assertEquals(1, movies.size());
		
		
	}
}


