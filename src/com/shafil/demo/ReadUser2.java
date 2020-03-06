package com.shafil.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shafil.entity.User;

public class ReadUser2 {

	public static void main(String[] args) {
		SessionFactory factory =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();

		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			User user=session.get(User.class,2);
			System.out.println(user);
			
			session.getTransaction().commit();
		}
		
		finally {
		factory.close();
	}
	
	}
}	
