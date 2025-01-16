package com.cdac.acts.account.current;

import java.util.Date;

import com.cdac.acts.account.Account;
import com.cdac.acts.deposit.Depositable;
import com.cdac.acts.minimum_balance_Exception.MinimumBalanceException;
import com.cdac.acts.withdraw.WithDrawable;

public class CurrentAccount extends Account implements Depositable, WithDrawable {
	private static final float INTEREST = 0.03F;
	private double balance;
	
	public CurrentAccount(String name, Date doj) {
		super(name, doj);
		this.balance = 0.0;
	}
	
	@Override
	public double calInterest() {
		return this.balance + ( this.balance * INTEREST );
	}
	
	@Override
	public double deposit(double amount) {
		System.out.println("Amount added successfully " + amount);
		this.balance = this.balance + amount;
		return balance;
	}

	@Override
	public double withdraw(double amount) throws MinimumBalanceException {
		if (this.balance < amount) {
			throw new MinimumBalanceException(" Amount is high then Account Balance.");
		}
		System.out.println("Amount withdrwan succesfully " + amount);
		this.balance = this.balance - amount;
		return balance;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Current [ balance = " + this.balance + ", Interest = " + this.calInterest() + "]";
	}
}
