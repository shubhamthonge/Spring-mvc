package com.mysql.com;

public class Student {

	 void m1(int a,int b) {
		int c=a+b;
		System.out.println("m1 with data type int, int"+c);
	}
	 void m1(int a, String b) {
			String c=a+b;
			System.out.println("m1 with data type int,String" +c);
		}
	protected int m1( String a,int b) {
		String	c=a+b;
			System.out.println("m1 with data type String, int" +c);
			return b;
		}
	 public void m1(String a,String b) {
		 String	c=a+b;
			System.out.println("m1 with data type String, String" +c);
		}
}
