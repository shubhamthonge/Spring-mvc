package com.infosys.app;

import java.util.Scanner;
public class stat {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
        System.out.println("Student name");
        System.out.println("raj ,kajal,karan,pankaj,dipak");
        String name = sc.next();
        
        switch (name){        
        case "raj":
        	System.out.println("10/10");
        	break;
       
        case "kajal":
        	System.out.println("8/10");
        	break;
       
        case "karan":
        	System.out.println("9/10");
        	break;
       
        case "pankaj":
        	System.out.println("7/10");
        	break;
       
        case "dipak":
        	System.out.println("9/10");
        
        	break;
       
        	default:
        		System.out.println("invalid input");
           
        	
        
   }
  }
}