package com.java1.com;

public class student {

	int id;
	String name;
	static  String course="java";
	 
	public void student1(int a,int b) {
		int z=a+b;
		System.out.println(z);
	System.out.println("in non static block");
		
	}
	 static void fy(int a) {
		 System.out.println(a);
		System.out.println("in static block"); 
		
	 }
	 static
	 {
		 System.out.println(" static block call first");
	 }
	
	 public static void main(String[] args) {
		 
		
		 student ss =new student();
			ss.id=19;
			ss.name="shub";
			 System.out.println(course);
			
			ss.student1(12,15);
			ss.fy(12);
			System.out.println(ss.id);
			System.out.println(ss.name);
			
	}
		
		
	    
	}

