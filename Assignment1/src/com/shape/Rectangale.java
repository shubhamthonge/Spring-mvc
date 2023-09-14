package com.shape;

public class Rectangale implements Polygon{

	float length=7.8f ;
	float breadth =5.8f;
	
	@Override
	public void calcArea() {
     float Are=	length*breadth	;
     System.out.println("Area of rectangale="+Are);
	}

	@Override
	public void calcPeri() {
		float pre=((length+breadth)*2);
		System.out.println("perimetar of rectangle="+pre);
	}

}
