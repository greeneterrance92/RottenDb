package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Favorites;
import com.revature.util.HibernateConfiguration;

public class FavoriteRepositoryImpl implements FavoriteRepository{

	@Override
	public List<Favorites> getAllFavorites() {
		List<Favorites> favorites = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			favorites = s.createQuery("FROM Favorites", Favorites.class).getResultList();
			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return favorites;
	}

	@Override
	public Favorites getFavoriteById(int favoritesId) {
		Favorites favorite = null;
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			favorite = s.createQuery("FROM Favorites where favoritesId = :favoritesId", Favorites.class)
					.setParameter("favoritesId", favoritesId)
					.getSingleResult();

			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return favorite;
	}

	@Override
	public void insertFavorite(Favorites favorite) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.save(favorite); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}

	@Override
	public void updateFavorite(Favorites favorite) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.update(favorite); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}

	@Override
	public void deleteFavorite(Favorites favorite) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.delete(favorite); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}

}
