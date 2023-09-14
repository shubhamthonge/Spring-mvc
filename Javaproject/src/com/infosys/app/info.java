package com.infosys.app;

import java.util.Scanner;
public class info {

	public static void main(String[] args) {
     Scanner sc= new Scanner (System.in);
     System.out.println("month in year");
     System.out.println("1,2,3,4,5,6,7,8,9,10,11,12");
    int month = sc.nextInt();
	 
      switch(month){
    	 case 1:{
    	 System.out.println("January");
    	 break;
         }
    	 case 2:{
    	 System.out.println("February");
    	 break;
    	 }
    	 case 3:{
    	 System.out.println("March");
    	 break;
    	 }
    	 case 4:{
    	 System.out.println("April");
    	 break;
    	 }
    	 case 5:{
    	 System.out.println("may");
    	 break;
    	 }
    	 case 6:{
    	 System.out.println("June");
    	 break;
    	 }
    	 case 7:{
    	 System.out.println("july");
    	 break;
    	 }
    	 case 8:{
    	 System.out.println("August");
    	 break;
    	 }
    	 case 9:{
    	 System.out.println("September");
    	 break;
         }
    	 case 10:{
    	 System.out.println("October");
    	 break;
	      }
    	 case 11:{
    	 System.out.println("November");
    	 break;
	     }
    	 case 12:{
    	 System.out.println("December");
    	 break;
	}

	}

}
}