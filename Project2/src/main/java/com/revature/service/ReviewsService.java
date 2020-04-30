package com.revature.service;

import java.util.List;

import com.revature.model.Reviews;
import com.revature.repository.ReviewRepository;
import com.revature.repository.ReviewRepositoryImpl;

public class ReviewsService {
	ReviewRepository rr;
	
	public List<Reviews> getAllReviews() {
		return this.rr.getAllReviews();
	}
	
	public Reviews getReviewById(int reviewid) {
		return this.rr.getReviewById(reviewid);
	}
	
	public void insertReview(Reviews review) {
		rr.insertReview(review);
	}
		
	public void updateReviews(Reviews review) {
		rr.updateReviews(review);
	}
		
	public void deleteReviews(Reviews review) {
		rr.deleteReviews(review);
	}
	
}
