package com.cdac.acts.shape.main;

import com.cdac.acts.shape.Shape;
import com.cdac.acts.shape.circle.Circle;
import com.cdac.acts.shape.rectangle.Rectangle;

public class Main {
	public static void main(String[] args) {
		Shape s = new Circle(7);
		System.out.println(s.calArea());
		System.out.println(s.calPerimeter());
//		s.draw();
		
		// safe downcasting
		if (s instanceof Circle) {
			Circle circle = (Circle) s;
			circle.draw();
		}
		
		s = new Rectangle(7, 8);
		System.out.println(s.calArea());
		System.out.println(s.calPerimeter());
		//s.draw();
		
		// safe downcasting
//		System.out.println(s.getClass());
//		System.out.println(Rectangle.class);
		
//		if (s instanceof Rectangle) {
//			Rectangle rect = (Rectangle) s;
//			rect.draw();
//		}
		
		if (s.getClass() == Rectangle.class) {
			Rectangle rect = (Rectangle) s;
			rect.draw();
		}
	}
}
