package com.acts.numbers;

import java.util.Scanner;

public class ComplexNumberTester {

	public static void main(String[] args) {
		//reference if ComplexNumber
		ComplexNumber c1 = new ComplexNumber(5, 4);
		System.out.println(c1.getString());

		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Please enter real:"); 
		int i = scanner.nextInt();

		System.out.println("\n Please enter img:");
		int j = scanner.nextInt();

		ComplexNumber c2 = new ComplexNumber(i, j);
		System.out.println(c2);
		System.out.println(c2.getString());
		
		scanner.close(); 
	}

}
