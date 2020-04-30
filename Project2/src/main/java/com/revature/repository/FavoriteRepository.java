package com.revature.repository;

import java.util.List;

import com.revature.model.Favorites;

public interface FavoriteRepository {

	public List<Favorites> getAllFavorites();
	public Favorites getFavoriteById(int favoritesId);
	public void insertFavorite(Favorites favorite);
	public void updateFavorite(Favorites favorite);
	public void deleteFavorite(Favorites favorite);
}
