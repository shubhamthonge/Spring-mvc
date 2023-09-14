package com.jvm.app;

public class Output1 {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		System.out.println("  in HDFC bank");
		h.currentaccount();
		h.jointaccouunt();
		h.savingaccouunt();
		h.zreobalanceaccount();
		h.accouunt(33, 55);
		System.out.println(h.accouunt(33, 55));
		
		System.out.println(" in Bank");
		Bank b=new HDFC();
		b.currentaccount();
		b.jointaccouunt();
		b.savingaccouunt();
		System.out.println(b.accouunt(22, 44));
	}
	
}
