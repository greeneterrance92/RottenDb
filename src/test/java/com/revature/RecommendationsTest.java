package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.model.Movies;
import com.revature.model.Recommendations;
import com.revature.repository.RecommendationsRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@TestInstance(Lifecycle.PER_CLASS)
@SpringBootTest
class RecommendationsTest {
		
		@MockBean
		RecommendationsRepository recommendationRepository;
		Movies mv1;
		Movies mv2;
		Movies mv3;
		List<Recommendations> reccomendations = new ArrayList<>();
		
		
		@BeforeAll
		public void setUp() {
			mv1 = new Movies(6, "something");
			mv2 = new Movies(3, "movie");
			mv3 = new Movies(10, "dolphin");

		}
		
		@Test
		public void testGetAllRecommendations(){
			
			List<Recommendations> rec = Arrays.asList(new Recommendations(10, mv1, "joe", "bob"),
													  new Recommendations(9, mv2, "bob", "billy"),
													  new Recommendations(4, mv3, "john", "jill"));

			Mockito.when(recommendationRepository.findAll()).thenReturn(rec);
			Assertions.assertEquals(3, rec.get(1).getMovie().getMovieId());
		}
	
		@Test
		public void getRecommendationByReceiver() {
			
			List<Recommendations> rec = Arrays.asList(new Recommendations(10, mv1, "joe", "bob"),
					  new Recommendations(9, mv2, "bob", "billy"),
					  new Recommendations(4, mv3, "john", "jill"));

			Mockito.when(recommendationRepository.findByReceiver("billy")).thenReturn(rec);
			Assertions.assertEquals(rec, recommendationRepository.findByReceiver("billy"));
		}
	
}
