package com.cdac.acts.rectangle;

import com.cdac.acts.shape.Shape;

public class Rectangle extends Shape {
	private float length;
	private float breadth;
	
	public Rectangle() {}
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public float calArea() {
		return length*breadth;
	}
	
	@Override
	public float calPerimeter() {
		return 2*(length+breadth);
	}
}
