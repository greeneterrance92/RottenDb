package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Recommendations;
import com.revature.repository.RecommendationsRepository;

@Service("recommendationsService")
public class RecommendationsService {
	
	@Autowired
	RecommendationsRepository recommendationsRepository;
	
	public List<Recommendations> getAllRecommendations(){
		return this.recommendationsRepository.findAll();
	}
	
	public Recommendations getRecommendationById(int id) {
		return this.recommendationsRepository.findById(id);
	}
	
	public List<Recommendations> getRecommendationsByReceiver(String receiver){
		return this.recommendationsRepository.findByReceiver(receiver);
	}
	
}
