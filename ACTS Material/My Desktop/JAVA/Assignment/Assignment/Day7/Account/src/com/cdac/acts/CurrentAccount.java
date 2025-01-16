package com.cdac.acts;

import java.util.Date;

public class CurrentAccount extends Account {

	public CurrentAccount(int accountNumber, String accountName, double amount, Date dateOfOpening) {
		super( accountName, amount, dateOfOpening);
		// TODO Auto-generated constructor stub
	}

	@Override
	double applyInterest(double amount) {
		return  amount = amount + 0.01*amount;
		
	}
}
