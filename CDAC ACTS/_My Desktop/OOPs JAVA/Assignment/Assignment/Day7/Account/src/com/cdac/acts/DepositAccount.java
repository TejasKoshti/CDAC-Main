package com.cdac.acts;

import java.util.Date;

public class DepositAccount extends Account{

	
	public DepositAccount(int accountNumber, String accountName, double amount, Date dateOfOpening) {
		super(accountName, amount, dateOfOpening);
		
	}

	@Override
	double applyInterest(double amount) {
		return  amount = amount + 0.08*amount;
		
	}
}
