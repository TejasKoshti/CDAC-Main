package com.cdac.acts.saving_account;

import java.util.Date;

import com.cdac.acts.account.Account;

public class SavingAccount extends Account {
	private static final double Intrest_Per = 0.03;
	
	private double accBalance;
	
	public SavingAccount() {
		super();
		this.accBalance = 0;
	}
	
	public SavingAccount(String name, Date date, double accBalance) {
		super(name, date);
		this.accBalance = accBalance;
	}
	
	@Override
	public double applyInterest() {
		double bal = accBalance *  Intrest_Per;
		bal += accBalance;
		this.accBalance = bal;
		return bal;
	}
	
	@Override
	public String toString() {
		return super.toString()+"[ Balance = "+this.accBalance
				+" ]";
	}
	
}
