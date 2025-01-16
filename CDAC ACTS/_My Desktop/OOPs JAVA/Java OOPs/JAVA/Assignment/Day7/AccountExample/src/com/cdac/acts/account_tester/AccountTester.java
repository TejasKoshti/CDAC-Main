package com.cdac.acts.account_tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.cdac.acts.account.Account;
import com.cdac.acts.current_account.CurrentAccount;
import com.cdac.acts.date_utils.MyDate;
import com.cdac.acts.deposite_account.DeposteAccount;
import com.cdac.acts.saving_account.SavingAccount;

public class AccountTester {

	public static void main(String[] args) throws ParseException {
		Account aSaving[] = new SavingAccount[5];
		Account aCurrent[] = new CurrentAccount[5];
		Account aDeposit[] = new DeposteAccount[5];
		
		while (true) {
		
			System.out.println("1 -> saving account: ");
			System.out.println("2 -> current account: ");
			System.out.println("3 -> deposit account: ");
			System.out.println("4 -> display saving account: ");
			System.out.println("5 -> display current account: ");
			System.out.println("6 -> display deposit account: ");
			System.out.println("7 -> exit");
			
			Scanner sc = new Scanner(System.in);
			
			int choice = sc.nextInt();
			
			int savingCount = 0;
			int depositCount = 0;
			int currentCount = 0;

			switch (choice) {
			case 1: 
				{
					sc.nextLine();
					System.out.println("Enter name: ");
					String name = sc.nextLine();
					
					System.out.println("Enter date of joining in dd/MM/yyyy format: ");
					String sDate = sc.nextLine();
					Date date = MyDate.getDate(sDate);
					
					System.out.println("Enter money to be deposite: ");
					double money = sc.nextDouble();
					
					aSaving[savingCount] = new SavingAccount(name, date, money);
					savingCount++;
				}
				break;
				
			case 2: 
			{
				sc.nextLine();
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter date of joining in dd/MM/yyyy format: ");
				String sDate = sc.nextLine();
				Date date = MyDate.getDate(sDate);
				
				System.out.println("Enter money to be deposite: ");
				double money = sc.nextDouble();
				
				aCurrent[currentCount] = new CurrentAccount(name, date, money);
				currentCount++;
			}
			break;
			
			case 3: 
			{
				sc.nextLine();
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				
				System.out.println("Enter date of joining in dd/MM/yyyy format: ");
				String sDate = sc.nextLine();
				Date date = MyDate.getDate(sDate);
				
				System.out.println("Enter money to be deposite: ");
				double money = sc.nextDouble();
				
				aDeposit[depositCount] = new DeposteAccount(name, date, money);
				depositCount++;
			} break;
			
			
			case 4:
			{
				for (int i=0; i<=savingCount; i++) {
					System.out.println(aSaving[i]);
					System.out.println(aSaving[i].applyInterest());
				}
			} break;
			
			case 5:
			{
				for (int i=0; i<=currentCount; i++) {
					System.out.println(aCurrent[i]);
					System.out.println(aCurrent[i].applyInterest());
				}
			} break;
			
			case 6:
			{
				for (int i=0; i<=depositCount; i++) {
					System.out.println(aDeposit[i]);
					System.out.println(aDeposit[i].applyInterest());
				}
			} break;
			
			case 7:
			{
				sc.close();
				System.exit(0);
			}
		}
		}
	}
}
