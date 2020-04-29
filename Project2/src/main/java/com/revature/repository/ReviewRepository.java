package com.revature.repository;

import java.util.List;

import com.revature.model.Reviews;

public interface ReviewRepository {
	public List<Reviews> getAllReviews();
	public Reviews getReviewById(int reviewid);
	public void insertReview(Reviews review);
	public void updateReviews(Reviews review);
	public void deleteReviews(Reviews review);
}
