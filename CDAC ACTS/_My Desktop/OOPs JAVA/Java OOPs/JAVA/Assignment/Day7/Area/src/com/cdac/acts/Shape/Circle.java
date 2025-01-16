package com.cdac.acts.Shape;

public class Circle extends Shape{

	private int radius;
	
	Circle(int radius){
		this.radius = radius;
	}
	@Override
	double calcArea() {
		
		return 3.14*radius*radius;
	}

	@Override
	double calcPerimeter() {
		
		return 2*3.14*radius;
	}
	
	void Draw() {
		System.out.println(" Circle ");
	}

}
