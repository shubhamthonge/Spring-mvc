package com.tech.hb;

import org.hibernate.cfg.Configuration;

public class Test {
	
	
	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
	}	
}