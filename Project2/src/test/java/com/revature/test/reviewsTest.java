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

import com.revature.model.Reviews;
import com.revature.repository.ReviewRepositoryImpl;

@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)

class reviewsTest {

	@Mock
	ReviewRepositoryImpl rr;
	List<Reviews> reviews = new ArrayList<>();
	Reviews review;
	
	@BeforeAll
	public void setUp() {
		rr = new ReviewRepositoryImpl();
		
		reviews.add(new Reviews(1, "first review", "pg-13", "thriller", "good", "cool movies", 60, "Too long.", 9, 5, 5, 5, 5, "YouTube"));
		reviews.add(new Reviews(2, "second review", "pg-13", "thriller", "bad", "hot movies", 60, "Too long.", 6, 4, 4, 4, 4, "YouTube"));
		System.out.println(reviews.size());
		review = new Reviews(4, "second review", "pg-13", "thriller", "bad", "hot movies", 60, "Too long.", 6, 4, 4, 4, 4, "YouTube");
		
		MockitoAnnotations.initMocks(this);
	}
	
	
	@Test
	public void testGetAllReviews() {
		
		List<Reviews> c = Arrays.asList(new Reviews(1, "first review", "pg-13", "thriller", "good", "cool movies", 60, "Too long.", 9, 5, 5, 5, 5, "YouTube"),
										 new Reviews(2, "second review", "pg-13", "thriller", "bad", "hot movies", 60, "Too long.", 6, 4, 4, 4, 4, "YouTube"));
										
		Mockito.when(rr.getAllReviews()).thenReturn(c);
		Assertions.assertEquals(1, c.get(0).getReviewId());
		Assertions.assertEquals("pg-13", c.get(1).getMpaaRating());
	}

	@Test 
	public void testGetReviewById() {
	Reviews c = new Reviews(1, "first review", "pg-13", "thriller", "good", "cool movies", 50, "Too long.", 9, 5, 5, 5, 5, "YouTube");
	Mockito.when(rr.getReviewById(1)).thenReturn(c);
	Assertions.assertEquals("cool movies", c.getCategory());
	}
	
	@Test 
	public void testInsertReview() {
		reviews.add(new Reviews(1, "first review", "pg-13", "thriller", "good", "cool movies", 60, "Too long.", 9, 5, 5, 5, 5, "YouTube"));
		System.out.println(reviews.size());
		Assertions.assertEquals("Too long.", reviews.get(0).getLengthTime());
	}
	
	@Test
	public void testUpdateReview() {
		review.setActing(8.5);
		review.setAudioScore(9);
		
		Assertions.assertEquals(8.5, review.getActing());
		Assertions.assertEquals(9, review.getAudioScore());
	}
	
	@Test
	public void testDeleteReview() {
		reviews.remove(0);
		System.out.println(reviews.size());
		Assertions.assertEquals(1, reviews.size());
		
		
	}
}
