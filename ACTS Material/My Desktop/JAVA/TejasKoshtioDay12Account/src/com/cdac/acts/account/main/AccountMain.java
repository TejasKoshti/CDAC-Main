package com.cdac.acts.account.main;

import java.awt.List;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

import javax.security.auth.login.AccountException;
import javax.security.auth.login.AccountNotFoundException;

import com.cdac.acts.account.validation.Validation;
import com.cdac.acts.accounta.Account;

public class AccountMain {
	
	public static void main(String[] args) throws AccountNotFoundException {
		
		LinkedList<Account> accountList = new LinkedList<Account>();
		
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		
		
		do {
			System.out.println("\n*********************Menu*********************");
			System.out.println("0. exit");
			System.out.println("1. add A/C");
			System.out.println("2. Display all Accounts");
			System.out.println("3. find account by account no.");
			System.out.println("4. Funds transfer");
			System.out.println("5. remove A/C from List");
			System.out.println("6. Apply interest on all Account");
			System.out.println("7. Sort accounts as per descending A/C No.");
			System.out.println("8. Sort by accountOpeningDate");
			System.out.println("Enter Your Choice");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			
			case 0 :{
				
				sc.close();
				System.exit(0);
				
			}break;
			case 1 :{
			
				System.out.println("Enter Te Name");
				String name = sc.nextLine();
				
				System.out.println("Entrer The SDate ");
				LocalDate opening = Validation.getValidOpening(sc.nextLine());
				
				System.out.println("Enter the e Amount");
				Double amount = Validation.miniBal(sc.nextDouble());
				
				accountList.add(new Account(name, opening, amount));
				
				
			}break;
			
			case 2 :{
				
				for(Account a : accountList) {
					System.out.println(a);
				}	
			}break;
			case 3 :{
				System.out.println("Enter the Acc no to Find");
				Integer acc = sc.nextInt();
				try {
					if(!Account.found(accountList, acc)) {
						throw new AccountNotFoundException("Account not found");
					}
					System.out.println(true);
				}catch(AccountNotFoundException e) {
					System.err.println(e.getMessage());
				}
			}break;
			
			case 4 :{
				System.out.println("Enter Your Acuntn Number ");
				Integer acc = sc.nextInt();
				boolean form = Account.found(accountList, acc);
				
					if(to && from) {
						System.out.println("Enter The AsmnoJASdnb ansgd   DSKjdhHN");
						Double  amount = sc.nextDouble();
						
						Account a1 = new 
					
					
					}
				
				
				
			}break;
			
			
		}while(choice != 0);
		
		
		
		
		
		
	}

}
