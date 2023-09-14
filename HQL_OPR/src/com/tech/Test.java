package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		player p=new player(7,"ms.dhoni", 45, "csk");
		player p1=new player(8,"virat", 45, "rcb");
		player p2=new player(9,"sachin", 45, "mi");
		player p3=new player(5,"rohit", 45, "mi");

		s.save(p);
		s.saveOrUpdate(p1);
		s.persist(p2);
		s.save(p3);
		
	     Transaction txm=s.beginTransaction();
	     txm.commit();
	}

}
