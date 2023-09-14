package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {

	public static void main(String[] args) {
		
		
		ApplicationContext cfg=new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("***** 1 para cons *****");
		student s=(student)cfg.getBean("a");
		System.out.println(s);
		System.out.println();
		
		System.out.println("***** zero para cons *****");
		student s1 =(student)cfg.getBean("a2");
		System.out.println(s1);
		System.out.println();
		
		System.out.println("***** 2 para cons *****");
		student s2 =(student)cfg.getBean("a3");
		System.out.println(s2);
	}

}
