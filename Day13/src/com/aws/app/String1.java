package com.aws.app;

public class String1 {

	public static void main(String[] args) {
		
		String s=new String("java");
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.charAt(2));
		
		String a=new String("aws");
		
		System.out.println(a+s);
		System.out.println( s.concat(a));
		System.out.println(s.equals(a));
		System.out.println(a.equalsIgnoreCase(s));
		
		String c="RDBMS";
		System.out.println(c.replace(c, a));
		System.out.println(c.replace(a, c));
		System.out.println(c.toLowerCase());
		
	}
}
