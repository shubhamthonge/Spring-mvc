package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update_p_no {

	public static void main(String[] args) {
		
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		employee e= new employee();
		e.setId(104);
		e.setName("sankat");
		e.setEmail("sankat@gmail.com");
		e.setPhone_no(8825855);
		
		
		s.save(e);
		s.beginTransaction().commit();
	
	}
}



	


