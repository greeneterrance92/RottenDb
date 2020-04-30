package com.revature.repository;

import java.util.List;

import com.revature.model.Recommendations;

public interface RecommendationRepository {

	public List<Recommendations> getAllRecommendations();
	
	public Recommendations getRecommendationById(int recommendid);
	
	public void insertRecommendation(Recommendations rec);
	
	public void updateRecommendation(Recommendations rec);
	
	public void deleteRecommendation(Recommendations rec);
}
