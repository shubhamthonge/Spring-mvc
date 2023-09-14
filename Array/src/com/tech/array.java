package com.tech;

public class array {
	
	public static void main(String[] args) {
		  int a[][]= {{1,2,3},
		  {4,5,6},
		  {7,8,9},
		  {9,5,1},	  
		  };
		  
		  for(int [] p:a){
			  
			  for(int y:p) {
				  System.out.print(y+" ");
			  }
			  System.out.println();
		  }
	}

}
