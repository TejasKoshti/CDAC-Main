package com.cdac.acts.account.main;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.comparator.DateComparator;
import com.cdac.acts.account.data_utils.DataUtils;
import com.cdac.acts.account.exception.MinBalanceException;
import com.cdac.acts.account.validation.Validation;

public class AccountMain {
	public static void main(String[] args) throws MinBalanceException {
		List<Account> list = DataUtils.getData();

		while (true) {

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

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Your Choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			
			case 0:
			{
				sc.close();
				System.exit(0);
			}

			case 1: {
				System.out.println("Enter Name");
				String name = sc.nextLine();

				System.out.println("Enter Date of Joining ");
				LocalDate opening = Validation.getValidOpening(sc.nextLine());

				System.out.println("Enter Amount");
				Double amount = Validation.miniBal(sc.nextDouble());

				list.add(new Account(name, opening, amount));
			}
				break;

			case 2: {
				for (Account a : list) {
					System.out.println(a);
				}
			}
				break;

			case 3: {
				System.out.println("Enter Account Number");
				Integer acc = sc.nextInt();
				try {
					if (!Account.found(list, acc)) {
						throw new AccountNotFoundException("account not found");
					}
					System.out.println(true);
				} catch (AccountNotFoundException e) {
					e.printStackTrace();
				}
			}
				break;

			case 4: {
				System.out.println("Enter Your Account Number");
				Integer acc = sc.nextInt();
				boolean from = Account.found(list, acc);

				System.out.println("Enter Account Number to whome to you transfer");
				Integer acc1 = sc.nextInt();
				boolean to = Account.found(list, acc1);

				try {
					if (to && from) {
						System.out.println("enter amount");
						Double amount = sc.nextDouble();

						Account l1 = Account.findAccount(list, acc);
						Account l2 = Account.findAccount(list, acc1);

						l1.witdraw(amount);
						l2.deposite(amount);
					} else {
						throw new AccountNotFoundException("account not found");
					}
				} catch (AccountNotFoundException e) {
					e.printStackTrace();
				}
				System.out.println("Money Transfered Succesfully");
			}
				break;

			case 5: {
				System.out.println("enter acc number to remove");
				Integer acc = sc.nextInt();

				for (int i = 0; i < list.size(); i++) {
					if (acc.equals(list.get(i).getAccNo())) {
						list.remove(i);
						System.out.println("account remove successfully");
					}
				}
			}
				break;

			case 6: {
				for (Account a : list) {
					a.applyInterest();
				}
			}
				break;
				
			case 7: {
				Collections.sort(list);
			}
				break;
				
			case 8: {
				Collections.sort(list, new DateComparator());
			}
				break;
			}
		}

	}
}
