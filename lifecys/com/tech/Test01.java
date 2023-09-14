package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

	public static void main(String[] args) {
		ApplicationContext cap=new ClassPathXmlApplicationContext("beans.xml");
		
		student s=(student) cap.getBean("a");
		System.out.println(s.getName());	

	}

}
