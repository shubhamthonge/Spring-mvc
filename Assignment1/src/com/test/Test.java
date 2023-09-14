package com.test;

import com.shape.Rectangale;
import com.shape.Square;

public class Test {

	public static void main(String[] args) {
		
		Square sq = new Square();
		sq.calcArea();
		sq.calcPeri();
		
		System.out.println("****************");
		Rectangale re=new Rectangale();
		re.calcArea();
		re.calcPeri();
	}
}
