package com.tech;

public class addd {

	public static void main(String[] args) {
		
		 int i, j;
		 int size=9;
		 int sum;

	        for (i=1; i<=4 ; i++)
	        {
	        	for(j=1;j<=size;j++)
	        	{
	        		System.out.print(" ");
	        	}
	        		
	        	for(int k=1;k<=3*i-2*i;k++)
	        	 {
	        		sum=i+j;
	        		if(sum%2==0 && sum>=6)
	        		System.out.print("*");
	        	
	        	 }
	        	
	        	System.out.println();
	        }
	       
	        	 
	}
	}
