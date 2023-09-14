package com.java.app;

public class Output {

	public static void main(String[] args) {
		
		HDFCbank h=new HDFCbank();
		h.savingaccount();
		h.currentaccount();
		h.intrestrate();
		h.zerobalanceaccount();
		h.netbanking();
		
		System.out.println("------- for Panjab national bank ------");
		Panjabnationalbank p=new Panjabnationalbank ();
		p.savingaccount();
		p.currentaccount();
		p.intrestrate();
		p.zerobalanceaccount();
		p.netbanking();
		p.demataccount();
	}
	
}
