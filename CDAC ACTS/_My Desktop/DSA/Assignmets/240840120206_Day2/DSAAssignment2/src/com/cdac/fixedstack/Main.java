package com.cdac.fixedstack;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 5;
		
		FixedSizeStack<String> fss = new FixedSizeStack(n);
		
		for(int i = 0 ; i < n+2 ; i++) {
			
			try {
				System.out.print("Enter Number: ");
				String choice = sc.nextLine();
				fss.push(choice);
			} catch (StackException e) {
				System.err.println("\n" + e.getMessage());
				break;
			}
		}
		
		
		for(int i = 0 ; i < n+2 ; i++) {
			try {
				System.out.println(fss.pop());
			} catch (StackException e) {
				System.err.println("\n" + e.getMessage());
				break;
			}
		}
		
		
		
	}

}
