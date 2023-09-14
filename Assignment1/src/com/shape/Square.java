package com.shape;

public class Square implements Polygon {

	public float side =15.8f;
	
	@Override
	public void calcArea() {
		float Are=side*side;
		System.out.println("Area of square="+Are);
		
	}

	@Override
	public void calcPeri() {

		float per =4*side;
		System.out.println("perimetar of squar="+per);
		
	}

}
