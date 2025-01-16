package com.cdac.growablestack;

import java.util.Scanner;

import com.cdac.fixedstack.StackException;

public class Main {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		GrowableStack<String> fss = new GrowableStack();
		
		for(int i = 0 ; i < 12 ; i++) {
			System.out.print("Enter Number: ");
			String choice = sc.nextLine();
			fss.push(choice);
		}
		
		
		for(int i = 0 ; i < 12 ; i++) {
			try {
				System.out.println(fss.pop());
			} catch (StackException e) {
				System.err.println("\n" + e.getMessage());
				break;
			}
		}
		
		sc.close();
		
		
	}

}
