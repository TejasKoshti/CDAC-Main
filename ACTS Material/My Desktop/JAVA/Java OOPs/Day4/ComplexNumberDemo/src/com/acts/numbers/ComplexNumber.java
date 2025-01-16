package com.acts.numbers;


public class ComplexNumber {
	//Instance members/props
	private int real; // DM or property or attribute
	private int img;

	//Initialization using constructor
	// Special member/instance method with same name
	//as class and no return type

	//implemented NO Arg ctor
	public ComplexNumber() {
		System.out.println("Ctor called"); 
		real = 0;
		img = 0; 
	}


	//implemented parameterized ctor
	public ComplexNumber(int i, int j) {
		System.out.println(" Parameterized Ctor called"); 
		real = i;
		img = j; 
	}

	//Instance methods
	/*
	 * public void accept() { Scanner scanner = new Scanner(System.in);
	 * System.out.println("\n Please enter real:"); real = scanner.nextInt();
	 * 
	 * System.out.println("\n Please enter img:"); img = scanner.nextInt();
	 * scanner.close(); }
	 */

	public String getString() {
		System.out.println(this);
		return "\n ComplexNumber[ real:" + real + ",img:" + img +"]";
	}
}
