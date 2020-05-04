package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Favorites;
import com.revature.repository.FavoritesRepository;

@Service("favoritesService")
public class FavoritesService {

	@Autowired
	FavoritesRepository favoritesRepository;
	
	public List<Favorites> getAllFavorites() {
		
		return this.favoritesRepository.findAll();
	}
}
