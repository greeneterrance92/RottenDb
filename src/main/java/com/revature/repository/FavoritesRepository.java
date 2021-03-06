package com.revature.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.Favorites;
import com.revature.model.Movies;
import com.revature.model.Users;

@Repository("favoritesRepository")
public interface FavoritesRepository extends JpaRepository<Favorites, Integer>{

	List<Favorites> findAll();

	List<Favorites> findFavoritesByUsersid(Users user);
	//<S extends Favorites> S save(Favorites favorite);
}
