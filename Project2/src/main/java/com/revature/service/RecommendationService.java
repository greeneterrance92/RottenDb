package com.revature.service;

import java.util.List;

import com.revature.model.Recommendations;
import com.revature.repository.RecommendationRepository;

public class RecommendationService {
	
	RecommendationRepository recr;
	
	public List<Recommendations> getAllRecommendations(){
		return this.recr.getAllRecommendations();
	}
	
	public Recommendations getRecommendationById(int recommendid) {
		return this.recr.getRecommendationById(recommendid);
	}
	
	public void insertRecommendation(Recommendations rec) {
		recr.insertRecommendation(rec);
	}
	
	public void updateRecommendation(Recommendations rec) {
		recr.updateRecommendation(rec);
	}
	
	public void deleteRecommendation(Recommendations rec) {
		recr.deleteRecommendation(rec);
	}
}
