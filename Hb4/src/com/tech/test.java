package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
	
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		student s1=new student();
		s1.setId(22);
		s1.setName("shubham");
		s1.setEmail("shub@gmail.com");
		
		s.save(s1);
		s.beginTransaction().commit();
	}

}
