package com.cdac.acts.shape.rectangle;

import com.cdac.acts.shape.Shape;
import com.cdac.acts.draw.Draw;

public class Rectangle implements Shape, Draw {
	private float length;
	private float breadth;
	
	public Rectangle(float length, float breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public float calArea() {
		return (float) length*breadth;
	}
	
	@Override
	public float calPerimeter() {
		return  (float) (2*(length+breadth));
	}
	
	@Override
	public void draw() {
		System.out.println("draw rectangle");
	}
}
