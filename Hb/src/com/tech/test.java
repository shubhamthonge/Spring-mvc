package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

		
		public static void main(String[] args) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			player p1= new player(0, null, null);
			p1.setAge(22);
			p1.setName("rohit");
			p1.setTeam("mumbai");
			
			session.save(p1);
			
			session.beginTransaction().commit();
	}

}
