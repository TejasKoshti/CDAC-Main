package com.cdac.acts.cirlce;

import com.cdac.acts.shape.Shape;

public class Circle extends Shape {
	private float radius;
	
	public Circle() {
		this.radius = 0;
	}
	
	public Circle(float radius) {
		this.radius = radius;
	}
	
	@Override
	public float calArea() {
		return (float) (Math.PI*(Math.pow(radius, 2)));
	}
	
	@Override
	public float calPerimeter() {
		return (float) (2*Math.PI*radius);
	}
	
	public void draw() {
		System.out.println("not need to drwa real Circle");
	}
}
