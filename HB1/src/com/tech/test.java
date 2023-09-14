package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class test {

	public static void main(String[] args) {
		System.out.println("111");
		Configuration cfg= new Configuration();
		cfg.configure("hibernate-cfg.xml");
		System.out.println("222");
		
	    SessionFactory sf=cfg.buildSessionFactory();
	   Session session= sf.openSession();
		System.out.println("333");
		
		player p=new player();
		p.setAge(27);
		p.setName("Rohit");
		p.setTeam("MI");
		
		session.save(p);
		
		session.beginTransaction().commit();
	   
	}

}
