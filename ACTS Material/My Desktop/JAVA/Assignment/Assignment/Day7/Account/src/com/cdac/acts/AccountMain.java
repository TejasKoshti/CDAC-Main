package com.cdac.acts;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {	
		Account ref;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("***** Welcome to RT Bank*****");
        System.out.println("Enter the Name :");
        String name = sc.nextLine();
        System.out.println("Enter the Amount: ");
        double amount = sc.nextDouble();
        
        
        
        int choice;
        do {
            System.out.println("********MENU*********");
            System.out.println("1. SavingAccount");
            System.out.println("2. CurrentAccount");
            System.out.println("3. DepositAccount");
            System.out.println("4. EXIT");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    Account sa = new SavingAccount(100, "RAJ", 25000.0, null);
                    System.out.println(sa.applyInterest(25000.0));
                } break;
                case 2: {
                    Account ca = new CurrentAccount(101, "Tejas", 30000.0, null);
                    System.out.println(ca.applyInterest(30000.0));
                } break;
                case 3: {
                    Account da = new DepositAccount(102, "sran", 14000.0, null);
                    System.out.println(da.applyInterest(14000.0));
                } break;
                case 4: {
                    System.out.println("Exiting the program.");
                } break;
                default: {
                    System.out.println("Invalid choice, please try again.");
                } break;
            }
        } while (choice != 4);

        sc.close(); // Close the scanner to prevent resource leaks
    }
}
