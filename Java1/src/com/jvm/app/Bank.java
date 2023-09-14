package com.jvm.app;

public class Bank {

	
      int  accouunt(int a,int b) {
	System.out.println(" accouunt in bank");
		return a+b;
	}
	void currentaccount() {
		System.out.println(" currentaccouunt in bank");
		
	}
	protected int savingaccouunt() {
		System.out.println("savingaccouunt in bank");
		return 0;	
	}
	public void jointaccouunt() {
		System.out.println("jointaccouunt in bank");
	}
}
