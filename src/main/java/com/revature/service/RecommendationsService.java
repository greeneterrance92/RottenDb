package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Favorites;
import com.revature.model.Movies;
import com.revature.model.Recommendations;
import com.revature.model.Users;
import com.revature.repository.MoviesRepository;
import com.revature.repository.RecommendationsRepository;
import com.revature.repository.UsersRepository;

@Service("recommendationsService")
public class RecommendationsService {
	
	@Autowired
	RecommendationsRepository recommendationsRepository;
	@Autowired
	UsersRepository usersRepository;
	@Autowired
	MoviesRepository moviesRepository;
	
	public List<Recommendations> getAllRecommendations(){
		return this.recommendationsRepository.findAll();
	}
	
	/*public Recommendations getRecommendationById(int id) {
		return this.recommendationsRepository.findById(id);
	}*/
	
	public List<Recommendations> getRecommendationsByReceiver(String receiver){
		return this.recommendationsRepository.findByReceiver(receiver);
	}
	
	public void insertRecommendation(Recommendations recommendation) {
		
		//System.out.println(favorite.getMovie().getMovieName());
		List<Movies> movie = this.moviesRepository.findByMoviename(recommendation.getMovie().getMovieName());
		//System.out.println(movie);
		recommendation.setMovie(movie.get(0));
		
		
		this.recommendationsRepository.save(recommendation);
	}
}
