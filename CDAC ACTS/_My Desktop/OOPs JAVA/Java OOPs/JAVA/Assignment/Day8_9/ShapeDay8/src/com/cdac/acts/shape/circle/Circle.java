package com.cdac.acts.shape.circle;

import com.cdac.acts.shape.Shape;
import com.cdac.acts.draw.Draw;

public class Circle implements Shape, Draw {
	private float radius;
	
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
	
	@Override
	public void draw() {
		System.out.println("draw circle");
	}
}
