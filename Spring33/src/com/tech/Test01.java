package com.tech;

public class Test01 {
	
	public static void main(String[] args) {
		
		System.out.println("***** zero para cons *****");
		student s=new student();
		s.setId(20);
		s.setName("shubham");
		System.out.println(s);
		System.out.println();
		
		System.out.println("***** 1 para cons *****");
		student s1=new student(30);	
		System.out.println(s1);
		System.out.println();
		 
		System.out.println("***** 2 para cons *****");
		student s2=new student(30,"raj");
		System.out.println(s2);


}
}