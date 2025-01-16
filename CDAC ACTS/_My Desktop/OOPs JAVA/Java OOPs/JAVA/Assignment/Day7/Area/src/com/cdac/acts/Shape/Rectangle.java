package com.cdac.acts.Shape;

public class Rectangle extends Shape{

	private double len;
	private double width;
	
	Rectangle(double len, double width){
		this.len=len;
		this.width=width;
	}
	@Override
	double calcArea() {
		
		return len*width;
	}

	@Override
	double calcPerimeter() {
		
		return 2*(len + width);
	}
	
	void draw() {
		System.out.println(" Rectangle ");
	}


}
