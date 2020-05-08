package com.revature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.revature.model.Favorites;
import com.revature.model.Movies;
import com.revature.model.Users;
import com.revature.repository.FavoritesRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@TestInstance(Lifecycle.PER_CLASS)
@SpringBootTest
class FavoritesTest {

	
	@MockBean
	FavoritesRepository favoritesRepository;
	List<Favorites> favs = new ArrayList<>();
	Users user1;
	Users user2;
	Movies mv1;
	Movies mv2;
	Favorites fv;
	Favorites fav;
	
	@BeforeAll
	public void setUp() {
		user1 = new Users(1, "boop", "bop");
		user2 = new Users(2, "bonk", "bonk");
		mv1 = new Movies(1, "Transformers");
		mv2 = new Movies(2, "Markiplier");
		fv = new Favorites(5, user2, mv1);
		favs.add(new Favorites(1, user1, mv1));
		favs.add(new Favorites(2, user2, mv2));
		favs.add(fv);
		fav = new Favorites(4, user2, mv2);

		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void testGetAllFavorites() {
		Users user3 = new Users(3, "blah blah", "something");
		List<Favorites> favorite = Arrays.asList(new Favorites(5, user2, mv2),
									  new Favorites(2, user3, mv1),
									  new Favorites(6, user1, mv2));

		Mockito.when(favoritesRepository.findAll()).thenReturn(favorite);
		Assertions.assertEquals(mv1, favorite.get(1).getMovie());
	}
	
	@Test
	public void testGetFavoriteById() {
		Favorites c = new Favorites(9, user1, mv2);

		Mockito.when(favoritesRepository.findFavoritesByUsersid(user1)).thenReturn(favs);
		Assertions.assertEquals(1, favs.get(0).getFavoritesId());
	}
	
	@Test
	public void testInsertFavorite() {
		Favorites fv1 = new Favorites(7, user1, mv2);
		favs.add(fv1);

		Assertions.assertEquals("bop", favs.get(3).getUser().getPass());
	}
	
	@Test
	public void testUpdateFavorite() {
		Users user4 = new Users(8, "guy", "man");
		Movies mv4 = new Movies(4, "Cool Movie");
		fav.setMovie(mv4);
		fav.setUser(user4);
		
		Assertions.assertEquals("Cool Movie", fav.getMovie().getMovieName());
	}

	@Test
	public void testDeleteFavorite() {
		favs.remove(fv);
		
		Assertions.assertEquals(3, favs.size());
	}
}
