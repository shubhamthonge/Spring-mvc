package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_save {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		employee e3= new employee(103,"kajal","kajal@gmail.com");
		employee e4= new employee(103,"sankat","sankat@gmail.com");
		employee e5= new employee(103,"kumar","kumar@gmail.com");
		s.save(e3);
		s.save(e4);
		s.save(e5);
		
		s.beginTransaction().commit();

	}

}
