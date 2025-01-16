package com.acts.generic;

public class GenericTest {

	public static void main(String[] args) {
		GenericType<Integer> type = new GenericType<Integer>(10);
		System.out.println(type);
		
		type.setNum1(100);
		System.out.println(type);
		
		
		GenericType<Double> type1 = new GenericType<Double>(20.21);
		System.out.println(type1);
		
		type1.setNum1(12.235);
		System.out.println(type1);
		
		GenericType<String> type2 = new GenericType<String>("Hello");
		System.out.println(type2);
		type2.setNum1("Utha >>>>>>>");
		System.out.println(type2);
		
		
		
	}
}
