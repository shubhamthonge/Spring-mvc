package com.hp.app;

public class prinenumber10 {
 
	
	public static void main(String[] args) {
		 int n=15;
		boolean prime=true;
		for(int i=2;i<15;i++) {
			if(n%i==0) {
				prime=false;
			}
		}
		System.out.println(prime);
	}
}
