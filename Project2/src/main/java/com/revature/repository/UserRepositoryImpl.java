package com.revature.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Users;
import com.revature.util.HibernateConfiguration;

public class UserRepositoryImpl implements UserRepository {

	@Override
	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			users = s.createQuery("FROM Users", Users.class).getResultList();
			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return users;
	}

	@Override
	public Users getUserByUsername(String Username) {
		Users user = null;
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			user = s.createQuery("FROM Users where Username = :Username", Users.class)
					.setParameter("Username", Username)
					.getSingleResult();

			tx.commit();
		} catch(HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			s.close();
		}
		
		return user;
	}

	@Override
	public void insertUser(Users user) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.save(user); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
	}
	

	@Override
	public void updateUser(Users user) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.update(user); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}

	
	@Override
	public void deleteUser(Users user) {
		Session s = null;
		Transaction tx = null;
		
		try {
			s = HibernateConfiguration.getSession();
			tx = s.beginTransaction();
			s.delete(user); 
			tx.commit();
		}catch(HibernateException e) {
			tx.rollback(); 
			e.printStackTrace();
		}finally {
			s.close(); 
		}
		
	}

	
}
