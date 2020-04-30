package com.revature.service;

import java.util.List;

import com.revature.model.Favorites;
import com.revature.repository.FavoriteRepository;

public class FavoritesService {

	FavoriteRepository fr;
	
	public List<Favorites> getAllFavorites(){
		return this.fr.getAllFavorites();
	}
	
	public Favorites getFavoriteById(int favoritesId) {
		return this.fr.getFavoriteById(favoritesId);
	}
	
	public void insertFavorite(Favorites favorite) {
		this.fr.insertFavorite(favorite);
	}
	
	public void updateFavorite(Favorites favorite) {
		this.fr.updateFavorite(favorite);
	}
	
	public void deleteFavorite(Favorites favorite) {
		this.fr.deleteFavorite(favorite);
	}
}
