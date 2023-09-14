package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Query_update {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Transaction txn= s.beginTransaction();
		
		String hql="update player2 set id=5,name='raj',age=29,team='rcb' where id=8";
		Query query=s.createQuery(hql);	
		
		int count=query.executeUpdate();
		
		if (count>0) {
			
			System.out.println("record update succfully");
		}else {
			System.out.println("record update unsuccfully");

		}
		
		txn.commit();


	}

}
