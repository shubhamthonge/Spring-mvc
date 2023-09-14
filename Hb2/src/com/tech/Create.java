package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Create {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		employee e=new employee(1,"shubham","pune");
		employee e1=new employee(2,"raj","mumbai");
		employee e2=new employee(3,"sankat","kolhpur");
		employee e3=new employee(4,"prakash","nasik");
		employee e4=new employee(5,"vishal","nagpur");
		employee e5=new employee(6,"rajat","pune");

		s.save(e);
		s.save(e1);
		s.save(e2);
		s.save(e3);
		s.save(e4);
		s.save(e5);
		
		Transaction txm=s.beginTransaction();
		txm.commit();

}
}