package com.cdac.acts.Shape;

import java.util.Scanner;

public class ShapeMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int choice;

        do {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Draw a Circle");
            System.out.println("2. Draw a Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            Shape shape = null;

            switch (choice) {
                case 1:
                	System.out.println("Enter radius");
                    int rad = scanner.nextInt();
                    shape = new Circle(rad);
                    break;
                case 2:
                	System.out.println("Enter sides");
                	int l = scanner.nextInt();
                	int b = scanner.nextInt();
                    shape = new Rectangle(l,b);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Skip the drawing step
            }

            // Draw the shape if one was created
            if (shape instanceof Circle) {
	            Circle specificCircle = (Circle) shape;
	            specificCircle.Draw();
	            System.out.println(specificCircle.calcArea());
	            System.out.println(specificCircle.calcPerimeter());
	        } else {
	            System.out.println("The shape is not a Circle.");
	            Rectangle specificRect = (Rectangle) shape;
	            System.out.println(specificRect.calcArea());
	            System.out.println(specificRect.calcPerimeter());
	            
	        }

        } while (choice != 3);

        scanner.close();
    }
}
