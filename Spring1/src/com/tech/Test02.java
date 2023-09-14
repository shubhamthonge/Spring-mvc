package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test02 {

	public static void main(String[] args) {
		
		ApplicationContext apc = new ClassPathXmlApplicationContext("beans.xml");
		student s =(student) apc.getBean("s2");
		System.out.println(s.getName());
		System.out.println(s.getAddr());
		System.out.println("*****************");
	
		student a=(student)apc.getBean("s3");
		System.out.println(a.getName());
		System.out.println(a.getAddr());
		System.out.println("******************");
	}

}
