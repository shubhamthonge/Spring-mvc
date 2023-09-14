package com.java.app;

public abstract class kotakbank implements Bank{
	
	int zerobalanceaccount() {
		System.out.println("--- in zero balance account ---");
		return 0;
	}
     abstract void netbanking();
}
