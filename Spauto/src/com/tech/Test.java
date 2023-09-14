package com.tech;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		
		 kabadi ka=(kabadi)ac.getBean("k");
		 System.out.println(ka.getName());
		 System.out.println(ka.getTeam().getTeamn());
		 System.out.println();
		 
		 cricket cr=(cricket)ac.getBean("c");
		 System.out.println(cr.getName());
		 System.out.println(cr.getTeam().getTeamn());
	}
	

}
