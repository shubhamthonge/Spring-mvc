package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {

	public static void main(String[] args) {

		ApplicationContext cfg = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("********************");
		student s=(student) cfg.getBean("a");
		s.setId(22);
		s.setName("ram");
		System.out.println(s);
		System.out.println();
		
		System.out.println("*********************");
		student s1=(student) cfg.getBean("a2");
		s1.setId(32);
		s1.setName("shiv");
		System.out.println(s1);
		System.out.println();
		
		System.out.println("**********************");
		student s2=(student)cfg.getBean("a3");
		s2.setId(43);
		s2.setName("krishna");
		System.out.println(s2);
	}

}
