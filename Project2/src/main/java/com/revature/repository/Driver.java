package com.revature.repository;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;

import com.revature.model.Reviews;
import com.revature.util.HibernateConfiguration;

public class Driver {
	
	
	
	static ReviewRepositoryImpl rv = new ReviewRepositoryImpl();
	public static void main(String...args) {
		
		Session session = HibernateConfiguration.getSession();
		Transaction tx = (Transaction) session.beginTransaction();
		
		List<Reviews> review = rv.getAllReviews();
		System.out.println(review);
		System.out.println(rv.getAllReviews());
	}
}
