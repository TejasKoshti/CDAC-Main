package com.cdac.acts.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
	
	public static ArrayList getInput(Scanner sc) {
		ArrayList<Double> arrList = new ArrayList<Double>(6);
		char ch = 'n';
		do {
			System.out.println("Enter numbers to add");
			arrList.add(sc.nextDouble());
			
			System.out.println("Add more? y/n");
			ch = sc.next().charAt(0);
		} while (ch != 'n');
		return arrList;
	}

	public static void main(String[] args) {
		
		ArrayList<Double> arrList = getInput(new Scanner(System.in));
		
		arrList.forEach(System.out::println);
		
		double sum = 0;
		for (double value : arrList) {
			sum += value;
		}
		System.out.println("Sum = " + sum);
	}

}
