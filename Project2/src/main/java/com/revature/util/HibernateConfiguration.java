package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfiguration {

	private static SessionFactory sessionFactory;
	
	

	public static Session getSession() {
		
		InputStream stream = null;
		Properties props = new Properties();
		
		try {
			stream = HibernateConfiguration.class.getResourceAsStream("/credentials.properties");
			props.load(stream);
			if (sessionFactory == null) {
				sessionFactory = new Configuration().configure()
						.setProperty("hibernate.connection.url", props.getProperty("url"))
						.setProperty("hibernate.connection.username", props.getProperty("username"))
						.setProperty("hibernate.connection.password", props.getProperty("password")).buildSessionFactory();
			}
			
			return sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
