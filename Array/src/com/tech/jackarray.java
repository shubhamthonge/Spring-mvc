package com.tech;

public class jackarray {

	public static void main(String[] args) {
		  int b[][]= {{1,8,3},
		  {4,5,},
		  {7,8,9,5},
		  {9,5,1},	  
		  };
		  
		  for(int [] z:b){
			  
			  for(int j:z) {
				  System.out.print(j+" ");
			  }
			  System.out.println();
		  }
	}

}


