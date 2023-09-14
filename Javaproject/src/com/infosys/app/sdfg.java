package com.infosys.app;

import java.util.Scanner;
public class sdfg {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" days in week");
		
        int week= sc.nextInt();

		switch (week) {
		case 1:{
		     System.out.println("sunday");
            break;
		}
		case 2:{
		     System.out.println("monday");
           break;
		}
		case 3:{
		     System.out.println("Tuesday");
	         break;
		}
		case 4:{
		     System.out.println("wednesday");
           break;
		}
		case 5:{
		     System.out.println("Thursday");
           break;
		}
		case 6:{
		     System.out.println("friday");
           break;
		}
		case 7:{
		     System.out.println("saturday");
           break;
		}
		default:
			System.out.println("Invalid");
		
		}
		
}
}
