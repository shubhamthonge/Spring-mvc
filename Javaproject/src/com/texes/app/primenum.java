package com.texes.app;

public class primenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int a;
   System.out.println("prime number form 1 to 100");
    
   for(int b=2;b<=100;b++){
	   a=0;
	   for(int j=2; j<= Math.sqrt(b);j++) {
		   if(b%j==0){
			   a +=1;
			   break; 
		   }
		  }
	   
      if (a == 0 && b !=1) {
      System.out.print(b+ " ");
      }
	}
	}

}	
	     