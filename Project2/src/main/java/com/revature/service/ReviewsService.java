package com.revature.service;

import java.util.List;

import com.revature.model.Reviews;
import com.revature.repository.ReviewRepository;
import com.revature.repository.ReviewRepositoryImpl;

public class ReviewsService {
	ReviewRepository rr = new ReviewRepositoryImpl();
	public List<Reviews> getAllReviews() {
		return this.rr.getAllReviews();
	}
	
	public Reviews getReviewById(int reviewid) {
		return this.rr.getReviewById(0);
	}
	
	public void insertReview(Reviews review) {
		this.rr.insertReview(review);
	}
	public void updateReviews(Reviews review) {
		this.rr.updateReviews(review);
	}
	public void deleteReviews(Reviews review) {
		this.rr.deleteReviews(review);
	}
	
	
}
