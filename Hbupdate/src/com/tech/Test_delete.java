package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		employee e= new employee();
		e.setId(102);
		e.setName("raj");
		e.setEmail("raj@gmail.com");
		
		s.delete(e);
		
		
		s.beginTransaction().commit();
	}


	}


