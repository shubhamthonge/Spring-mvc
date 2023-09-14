package com.bigdata.com;

import java.util.ArrayList;

public class Car {
 public static void main(String[] args) {
	ArrayList b=new ArrayList();
	 
	b.add(10);
	b.add(20);
	b.add(30);
	b.add(10);
	System.out.println(b);
	System.out.println(b.remove(2));
	b.add(2,20);
	System.out.println(b.get(1));
	System.out.println(b.remove(2));
	System.out.println(b);
	System.out.println(b.size());
}
}
