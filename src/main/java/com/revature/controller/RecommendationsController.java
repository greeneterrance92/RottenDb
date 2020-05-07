package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Recommendations;
import com.revature.service.RecommendationsService;

@RestController("recommendationsController")
@RequestMapping("/recommendations")
@CrossOrigin
public class RecommendationsController {
	
	private RecommendationsService recommendationsService;
	
	
	@Autowired
	public RecommendationsController(RecommendationsService recommendationsService) {
		this.recommendationsService = recommendationsService;
	}
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Recommendations> getAllRecommendations(){
		return this.recommendationsService.getAllRecommendations();
	}
	
	/*@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Recommendations> getRecommendationById(@PathVariable int id){
		
		Recommendations rec = this.recommendationsService.getRecommendationById(id);
		
		return new ResponseEntity<>(rec, HttpStatus.OK);
	}*/
	
	@GetMapping(path = "/name/{receiver}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Recommendations>> getReviewsByReceiver(@PathVariable String receiver) {
		return new ResponseEntity<>(this.recommendationsService.getRecommendationsByReceiver(receiver), HttpStatus.OK);
	}
	
	
}
