package com.cdac.acts;

import java.util.Date;

public abstract class Account {

	private int accountNumber;
	private String accountName;
	private double amount ;
	private Date dateOfOpening;
	private Date currDate = new Date();
	
	private static int generateAccountNumber = 1000;
	
	

	public Account() {
		super();
	}



	public Account(String accountName, double amount, Date dateOfOpening) {
		super();
		this.accountNumber = generateAccountNumber++;
		this.accountName = accountName;
		this.amount = amount;
		this.dateOfOpening = dateOfOpening;
	}



	public int getAccountNumber() {
		return accountNumber;
	}




	abstract double applyInterest(double amount);
	
	@Override
	public String toString() {
		return "Account [accountNumber=" + getAccountNumber() + ", accountName=" + accountName + ", amount=" + amount
				+ ", dateOfOpening=" + dateOfOpening + "]";
	}
}
