package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.Favorites;
import com.revature.model.Movies;
import com.revature.model.Users;
import com.revature.repository.FavoritesRepository;
import com.revature.repository.MoviesRepository;
import com.revature.repository.UsersRepository;

@Service("favoritesService")
public class FavoritesService {

	@Autowired
	FavoritesRepository favoritesRepository;
	@Autowired
	UsersRepository usersRepository;
	@Autowired
	MoviesRepository moviesRepository;

	public List<Favorites> getAllFavorites() {

		return this.favoritesRepository.findAll();
	}

	public List<Favorites> findFavoritesByUser(Users user){
		return this.favoritesRepository.findFavoritesByUsersid(user);
	}

	public void insertFavorite(Favorites favorite) {
		System.out.println(favorite);
		if (!(favorite.getMovie() == null) && !(favorite.getUser() == null)) {
			System.out.println(favorite.getMovie().getMovieName());
			List<Movies> movie = this.moviesRepository.findByMoviename(favorite.getMovie().getMovieName());
			System.out.println(movie);
			Users user = this.usersRepository.findUsersByUsername(favorite.getUser().getUsername());
			favorite.setMovie(movie.get(0));
			favorite.setUser(user);
			this.favoritesRepository.save(favorite);
		}

	}
}
