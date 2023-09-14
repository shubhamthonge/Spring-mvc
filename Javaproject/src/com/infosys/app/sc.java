package com.infosys.app;

import java.util.Scanner;

public class sc {
	public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	System.out.println("first number:");
	int a=sc.nextInt();
	System.out.println("second number:");
	int b= sc.nextInt();
	System.out.println("enter opration:+,-,*,/");
	String input = sc.next();
	System.out.println("result:");
	if(input.equals("+")) {
		System.out.println(a+b);
	}else if(input.equals("-")) {	
	 System.out.println(a-b);
	}else if(input.equals("*")) {	
		 System.out.println(a*b);
		}else if(input.equals("/")) {	
		 System.out.println(a/b);
	}else {
	System.out.println("invalid oprater please enter valid oprater");
	
	}
	}
	
}