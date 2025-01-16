package com.cdac.acts.main;

import java.util.Scanner;

import com.cdac.acts.cirlce.Circle;
import com.cdac.acts.shape.Shape;
import com.cdac.acts.rectangle.Rectangle;

public class Main {

	public static void main(String[] args) {
		Shape s = null;
		s = new Circle();
		
		// Downcasting to circle
		if (s instanceof Circle) {
			Circle circle = (Circle) s;
			circle.draw();
		}
		
		while (true) {
			System.out.println("1 -> area of Circle");
			System.out.println("2 -> perimeter of Circle");
			System.out.println("3 -> area of Rectangle");
			System.out.println("4 -> perimeter of Rectangle");
			System.out.println("5 -> exit");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					{
						System.out.println("enter radius: ");
						float r = sc.nextFloat();
						s = new Circle(r);
						System.out.println(s.calArea());
					}break;
					
				case 2:
					{
						System.out.println("enter radius: ");
						float r = sc.nextFloat();
						s = new Circle(r);
						System.out.println(s.calPerimeter());
					}break;
					
				case 3:
				{
					System.out.println("enter length: ");
					float l = sc.nextFloat();
					System.out.println("enter breadth: ");
					float b = sc.nextFloat();
					s = new Rectangle(l,b);
					System.out.println(s.calArea());
				}break;
				
				case 4:
				{
					System.out.println("enter length: ");
					float l = sc.nextFloat();
					System.out.println("enter breadth: ");
					float b = sc.nextFloat();
					s = new Rectangle(l,b);
					System.out.println(s.calPerimeter());
				}break;
				
				case 5:
					return;
					
				default:
					System.out.println("invalid input");
			}
		}

	}

}
