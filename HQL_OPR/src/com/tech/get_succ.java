package com.tech;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class get_succ {

	
		public static  void main(String[] args) {
			
			Configuration cfg= new Configuration();
			cfg.configure("hibernate.cfg.xml");
			
			SessionFactory sf= cfg.buildSessionFactory();
			Session s=sf.openSession();
			
			player p= s.get(player.class,7);
			
			System.out.println(p.getId());
			System.out.println(p.getName());
			System.out.println(p.getAge());
			System.out.println(p.getTeam());
	}

}
