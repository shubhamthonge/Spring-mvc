package com.bigdata.com;

import java.util.ArrayList;

public class Arryalistas {

public static void main(String[] args) {
	ArrayList a=new ArrayList();
	
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(10);
	a.add(50);
	a.add(40);
	System.out.println(a.size());
	System.out.println(a);
	System.out.println(a.get(2));
	a.add(3,22);
	System.out.println(a.size());
	System.out.println(a);
	System.out.println(a.remove(2));
	System.out.println(a.size());
	System.out.println("****** for loops ******");
	for(int i=1;i<a.size();i++) {
		System.out.println(i);
	}
	System.out.println(a.remove(1));
}
}