package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Movies;
import com.revature.model.Reviews;
import com.revature.util.HibernateConfiguration;

public class MovieRepositoryImpl implements MovieRepository {

	@Override
	public List<Movies> getAllMovies() {
		List<Movies> movies = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			movies = s.createQuery("FROM Movies", Movies.class).getResultList();
			tx.commit();
					
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return movies;
	}

	@Override
	public Movies getMovieById(int movieid) {
		Movies movie = null;
		Session s = null;
		Transaction tx = null;
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			movie = s.createQuery("FROM Movies where movieid= :movieid", Movies.class)
			.setParameter("movieid", movieid)		
			.getSingleResult();
			tx.commit();
					
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return movie;
	}

	@Override
	public void insertMovie(Movies movie) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.save(movie);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	@Override
	public void updateMovies(Movies movie) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.update(movie);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	@Override
	public void deleteMovies(Movies movie) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.delete(movie);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}
	}

