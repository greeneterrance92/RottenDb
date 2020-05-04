package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Reviews;
import com.revature.repository.ReviewsRepository;

@Service("reviewsService")
public class ReviewsService {
	
	ReviewsRepository reviewsRepository;
	
	@Autowired
	public ReviewsService(ReviewsRepository reviewsRepository) {
		this.reviewsRepository = reviewsRepository;
	}
	
	public List<Reviews> getAllReviews() {
		return this.reviewsRepository.findAll();
	}
	
	public Reviews getReviewsById(int id) {
		return this.reviewsRepository.findReviewsByReviewsId(id);
	}
	
	public List<Reviews> getReviewsByName(String reviewname) {
		return this.reviewsRepository.findByReviewname(reviewname);
	}
	
	public void addReview(Reviews r) {
		this.reviewsRepository.save(r);
	}
	
	public void deleteReviews(Reviews r) {
		this.reviewsRepository.delete(r);
	}
}
