package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test02 {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Employee e1=s.get(Employee.class,4);
		System.out.println(e1);
		
		Employee e2=s.get(Employee.class,5);
		System.out.println(e2);
		
		Employee e3=s.get(Employee.class,7);
		System.out.println(e3);
		
		Employee e4=s.get(Employee.class,4);
		System.out.println(e4);
		
		s.close();
		System.out.println("*********after session close*********");

		Session s1=sf.openSession();
		Employee e5=s1.get(Employee.class,5);
		System.out.println(e5);
		
		Employee e6=s1.get(Employee.class,8);
		System.out.println(e6);
		
		Employee e7=s1.get(Employee.class,5);
		System.out.println(e7);

		
		s1.close();
		
		
	}

}
