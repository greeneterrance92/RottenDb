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

import com.revature.model.Favorites;
import com.revature.model.Reviews;
import com.revature.model.Users;
import com.revature.service.FavoritesService;

@RestController("favoritesController")
@RequestMapping("/fav")
@CrossOrigin
public class FavoritesController {
	
	@Autowired
	private FavoritesService favoritesService;
	
	@GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Favorites> getAllMovies(){
		return this.favoritesService.getAllFavorites();
	}
	
	@GetMapping(path = "/id/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Favorites>> getFavoritesByUserid(@PathVariable int userId){
		List<Favorites> favorite = this.favoritesService.findFavoritesByUserid(userId);
		
		
		return new ResponseEntity<>(favorite, HttpStatus.OK);
	}
	
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void insertFavorite(@RequestBody Favorites favorite) {
		System.out.println(favorite);
		this.favoritesService.insertFavorite(favorite);
	}
	
}
