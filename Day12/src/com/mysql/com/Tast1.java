package com.mysql.com;

public class Tast1 {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(20, 30);
		int c=a.add(22, 55);
		System.out.println(c);
		
		a.add(13, "Karan");
		
		a.add("Sankat", "Patil");
	    String b=a.add("Sankat", "Patil");
	    System.out.println("******" +b);
	}
	
}
