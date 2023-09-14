package com.java.app;

public class Panjabnationalbank extends HDFCbank implements Bank1 {

	@Override
	public int demataccount() {
		System.out.println("--- in demat account ---");

		return 0;
	}

}
