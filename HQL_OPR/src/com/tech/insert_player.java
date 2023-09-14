package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class insert_player {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		String insert_player = "insert into player2 (id , name ,age,team)"
				+ " select p.id, p.name, p.age, p.team from player p";
		

		Query query = s.createQuery(insert_player);
		
		
		Transaction txn= s.beginTransaction();
		query.executeUpdate();
		txn.commit();
	}

}
