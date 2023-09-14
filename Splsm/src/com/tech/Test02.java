package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

	public static void main(String[] args) {

		ApplicationContext  ap=new ClassPathXmlApplicationContext("beans.xml");
		employee e=(employee)ap.getBean("a");
		System.out.println(e.getName());
		System.out.println(e.getAddr());
		System.out.println(e.getEmail());
		System.out.println(e.getPhoneno());
		
	}

}
