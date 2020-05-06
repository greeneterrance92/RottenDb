package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Reviews;
import com.revature.service.ReviewsService;

@RestController("reviewsController")
@RequestMapping("/reviews")
@CrossOrigin
public class ReviewsController {

	private ReviewsService reviewsService;
	
	@Autowired
	public ReviewsController(ReviewsService reviewsService) {
		this.reviewsService = reviewsService;
	}
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Reviews> getAllReviews(){
		return this.reviewsService.getAllReviews();
	}
	
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Reviews> getReviewsById(@PathVariable int id) {
		return new ResponseEntity<>(this.reviewsService.getReviewsById(id), HttpStatus.OK);
	}
	
	@GetMapping(path = "/name/{reviewname}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Reviews>> getReviewsByName(@PathVariable String reviewname) {
		return new ResponseEntity<>(this.reviewsService.getReviewsByName(reviewname), HttpStatus.OK);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertReview(@RequestBody Reviews review) {
		this.reviewsService.addReview(review);
	}
}
