package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		System.out.println("111");
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		System.out.println("222");
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		System.out.println("333");
		
		Student s2 = new Student();
		s2.setId(1);
		s2.setName("rohit");
		
		session.save(s2);
		
		session.beginTransaction().commit();

	}

}
