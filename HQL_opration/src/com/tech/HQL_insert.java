package com.tech;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class HQL_insert {

	public static void main(String[] args) {

		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		String hql_insert = "insert into employee_new (id , name , addr)"
				+ " select e.id, e.name, e.addr from employee_old e";
		

		Query query = s.createQuery(hql_insert);
		
		
		Transaction txn= s.beginTransaction();
		query.executeUpdate();
		txn.commit();
	}

}
