package com.cdac.queue;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n = 5;
		FixedQueue<String> fq = new FixedQueue<String>(n);
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i < n+3 ; i++) {
			System.out.print("Enter something: ");
			String str = sc.nextLine();
			try {
				fq.enqueue(str);
			} catch (QueueException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
		
		
		for(int i = 0 ; i < n+3 ; i++) {
			try {
				System.out.println(fq.dequeue());
			} catch (QueueException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
	}
}
