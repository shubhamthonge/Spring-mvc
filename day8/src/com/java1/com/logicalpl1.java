package com.java1.com;

public class logicalpl1 {

	public static void main(String[] args) {
		int c=20;
		int b=15;
		
		System.out.println(c<b && b>c);
		System.out.println(c>b && b>c);
		System.out.println(c>b && b<c);
		
		
		int k=15;
		int m=25;
		System.out.println("...............");
		System.out.println(k<m || k>m);
		System.out.println(k>m || k<m);
		System.out.println(c<=b || b>=c);
		System.out.println(c<b || b>c);
	}
}
