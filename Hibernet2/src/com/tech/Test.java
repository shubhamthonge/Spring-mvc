package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration Cfg = new Configuration();
		Cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = Cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		player p1= new player();
		p1.setAge(22);
		p1.setName("rohit");
		p1.setTeam("mumbai");
		
		session.save(p1);
		
		session.beginTransaction().commit();
	}

}
