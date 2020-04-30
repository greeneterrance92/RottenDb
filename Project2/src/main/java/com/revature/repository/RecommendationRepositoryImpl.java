package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Recommendations;
import com.revature.util.HibernateConfiguration;

public class RecommendationRepositoryImpl implements RecommendationRepository {

	@Override
	public List<Recommendations> getAllRecommendations() {
		List<Recommendations> rec = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			rec = s.createQuery("FROM Recommendations", Recommendations.class).getResultList();
			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return rec;
	}

	
	@Override
	public Recommendations getRecommendationById(int recommendid) {
		Recommendations rec = null;
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			rec = s.createQuery("FROM Recommendations where recommendid = :recommendid", Recommendations.class)
					.setParameter("recommendid", recommendid)
					.getSingleResult();

			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return rec;
	}



	@Override
	public void insertRecommendation(Recommendations rec) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.save(rec); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}


	
	@Override
	public void updateRecommendation(Recommendations rec) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.update(rec); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}


	
	@Override
	public void deleteRecommendation(Recommendations rec) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.delete(rec); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}
	
	

	
}
