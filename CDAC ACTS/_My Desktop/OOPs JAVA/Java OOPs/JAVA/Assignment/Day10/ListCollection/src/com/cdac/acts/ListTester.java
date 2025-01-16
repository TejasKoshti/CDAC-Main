package com.cdac.acts;

import java.util.ArrayList;
import java.util.Scanner;

public class ListTester {

	public static void main(String[] args) {
		
		ArrayList<Double> listDouble = new ArrayList<Double>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the elements");
		
		
		boolean choice = true;
		String c;
		double sum = 0.0;
		do {
			
			   int i = 0;
			
				listDouble.add(i, sc.nextDouble());
				sum = sum + listDouble.get(i);
				i++;
			
			
			
			System.out.println("do you want to continue: ");
		    
			c = sc.next();
			
			System.out.println("enter the next elements");
			
			if(c.charAt(0) == 'Y' || c.charAt(0) == 'y') {
				choice = true;
			}else {
				choice = false;
			}
			
			
			
		}while( choice);

		System.out.println(sum);
	}

}
