package com.mysql.com;

public class Addition {

	protected int add(int a,int b) {
	 int c=a+b;
	 System.out.println(c);
	 return c;
	}
	 void add(int a,String b) {
		String c=a+b;
		 System.out.println(c);
		}
	private void add(String a,int b) {
		String c=a+b;
		 System.out.println(c);
		}
	public String add(String a,String b) {
		String c=a+b;
		 System.out.println(c);
		 return c;
		}
}
