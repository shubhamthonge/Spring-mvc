package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class delete {

	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();

		String hql_delete = "delete from employee_new where (id=1)";
				
		

		Query query = s.createQuery(hql_delete);
		
		
		Transaction txn= s.beginTransaction();
		query.executeUpdate();
		txn.commit();
				
	}
}
