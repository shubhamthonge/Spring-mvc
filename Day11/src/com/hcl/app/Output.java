package com.hcl.app;

import com.hcl.com.BOB;

public class Output  {
	
	public static void main(String[] args) {
		System.out.println("***** Kotak  *****");
		Kotak k= new Kotak();
		k.current();
		k.demat();
		k.intrestrate();
		k.zerobalance();
		System.out.println("***** HDFC *****");
		
		HDFC h=new HDFC();
		h.current();
		h.demat();
		h.intrestrate();
		h.zerobalance();
		h.lone();
		System.out.println("***** Axis *****");

		Axis a=new Axis();
		a.current();
		a.demat();
		a.zerobalance();
		a.goldlone();
		a.intrestrate();
		a.lone();
		a.homelone();
		
		System.out.println("***** BOB *****");
		BOB b=new BOB();
		b.zerobalance();
		
		System.out.println("***** SBI *****");
		SBI s=new SBI();
		s.intrestrate();
		s.zerobalance();
		s.fubds();
	}

}
