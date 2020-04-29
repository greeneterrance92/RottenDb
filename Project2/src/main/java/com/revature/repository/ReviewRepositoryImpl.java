package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.revature.util.HibernateConfiguration;
import com.revature.model.Reviews;



public class ReviewRepositoryImpl implements ReviewRepository {
	
	@Override
	public List<Reviews> getAllReviews() {
		List<Reviews> reviews = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			reviews = s.createQuery("FROM Reviews", Reviews.class).getResultList();
			tx.commit();
					
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return reviews;
	}

	@Override
	public Reviews getReviewById(int reviewid) {
		Reviews review = null;
		Session s = null;
		Transaction tx = null;
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			review = s.createQuery("FROM Reviews where reviewid= :reviewid", Reviews.class)
			.setParameter("reviewid", reviewid)		
			.getSingleResult();
			tx.commit();
					
		} catch(HibernateException e) {
			e.printStackTrace();
		} finally {
			s.close();
		}
		return review;
	}

	@Override
	public void insertReview(Reviews review) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.save(review);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	@Override
	public void updateReviews(Reviews review) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.update(review);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}

	@Override
	public void deleteReviews(Reviews review) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.delete(review);
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			s.close();
		}
		
	}
	}

