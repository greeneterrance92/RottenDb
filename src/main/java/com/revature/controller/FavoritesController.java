package com.revature.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.model.Favorites;
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
	
}
