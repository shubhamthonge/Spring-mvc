package com.hcl.com;

import com.hcl.app.Axis;
import com.hcl.app.HDFC;
import com.hcl.app.Kotak;

public class Output {
 
	public static void main(String[] args) {
		System.out.println("***** HDFC *****");
		Kotak k= new Kotak();
		k.demat();
		k.intrestrate();
		
		System.out.println("***** HDFC *****");
		HDFC h=new HDFC();
		h.demat();
		h.intrestrate();
		h.lone();
		
		System.out.println("***** Axis *****");
		Axis a=new Axis();
		a.demat();
		a.intrestrate();
		a.lone();
		a.homelone();
		
		System.out.println("***** BOB *****");
		BOB b=new BOB();
		b.fubds();
	}



}

