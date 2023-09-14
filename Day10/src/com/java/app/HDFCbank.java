package com.java.app;

public class HDFCbank extends kotakbank implements Bank{

	@Override
	public void savingaccount() {
		System.out.println("--- in savingaccount ---");
		
	}

	@Override
	public int currentaccount() {
		System.out.println("--- in currentaccount ---");
		return 0;
	}

	@Override
	public double intrestrate() {
		System.out.println("--- in intrestrate ---");
		return 0;
	}

	@Override
	void netbanking() {
		System.out.println("--- in netbanking ---");
		
	}

}
