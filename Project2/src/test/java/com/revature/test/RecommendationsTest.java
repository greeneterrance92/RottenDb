package com.revature.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.revature.model.Movies;
import com.revature.model.Recommendations;
import com.revature.model.Users;
import com.revature.repository.RecommendationRepository;
import com.revature.repository.RecommendationRepositoryImpl;


@RunWith(JUnitPlatform.class)
@TestInstance(Lifecycle.PER_CLASS)
class RecommendationsTest {
		
		@Mock
		RecommendationRepository recr;
		Movies mv1;
		Movies mv2;
		Movies mv3;
		List<Recommendations> reccomendations = new ArrayList<>();
		
		
		@BeforeAll
		public void setUp() {
			mv1 = new Movies(6, "something");
			mv2 = new Movies(3, "movie");
			mv3 = new Movies(10, "dolphin");
			recr = new RecommendationRepositoryImpl();
		}
		
		/*@Test
		public void testGetAllRecommendations(){
			
			List<Recommendations> rec = Arrays.asList(new Recommendations(Recommendations),
													  new Recommendations(9, mv2, "bob", "billy"),
													  new Recommendations(4, mv3, "john", "jill"));

			Mockito.when(recr.getAllRecommendations()).thenReturn(rec);
			Assertions.assertEquals(3, rec.get(1).getMovie().getMovieId());
		}*/
	
		@Test
		public void getRecommendationById() {
			Recommendations c = new Recommendations(9, mv2, "bob", "billy");

			Mockito.when(recr.getRecommendationById(9)).thenReturn(c);
			Assertions.assertEquals("bob", c.getSender());
		}
	
}
