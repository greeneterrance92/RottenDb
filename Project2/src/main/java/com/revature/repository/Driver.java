package com.revature.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.revature.model.Users;
import com.revature.util.HibernateConfiguration;

public class Driver {
	
	static UserRepositoryImpl ur = new UserRepositoryImpl();
	public static void main(String...args) {
		Users user = new Users("person", "my password");
		
		/*Session session = HibernateConfiguration.getSession();
		Transaction tx = session.beginTransaction();*/
		
		ur.insertUser(user);

		
		/*tx.commit();
		session.close();*/

	}
}
