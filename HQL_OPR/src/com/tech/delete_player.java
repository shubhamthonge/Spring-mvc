package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete_player {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		String delete_player= "delete from player2 where (id=7)";

		Query query = s.createQuery(delete_player);
		
		
		Transaction txn= s.beginTransaction();
		query.executeUpdate();
		txn.commit();
	}

}
