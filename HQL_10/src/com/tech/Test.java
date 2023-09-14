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
		Transaction txn=s.beginTransaction();
		player p1=new player(1,"rohit","MI");
		player p2=new player(2,"MS dhoni","CSK");
		player p3=new player(3,"kl rahul","LSG");
		player p4=new player(4,"hardik p","GT");
		player p5=new player(5,"virat","RCB");
		player p6=new player(6,"shubman","GT");
		player p7=new player(7,"ishan k","MI");
		player p8=new player(8,"jadeja","CSK");
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		s.save(p4);
		s.save(p5);
		s.save(p6);
		s.save(p7);
		s.save(p8);

		txn.commit();
	}

}
