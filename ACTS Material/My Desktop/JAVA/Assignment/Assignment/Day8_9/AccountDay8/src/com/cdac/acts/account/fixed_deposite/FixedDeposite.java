package com.cdac.acts.account.fixed_deposite;

import java.util.Date;

import com.cdac.acts.account.Account;
import com.cdac.acts.deposit.Depositable;
import com.cdac.acts.maturity.Maturable;

public class FixedDeposite extends Account implements Depositable, Maturable {
	private static final float INTEREST = 0.08F;
	private double amount;
	
	public FixedDeposite(String name, Date doj) {
		super(name, doj);
		this.amount = 0.0;
	}
	
	@Override
	public double calInterest() {
		return 0.0;
	}
	
	@Override
	public double deposit (double amount) {
		System.out.println("Amount added successfully " + amount);
		this.amount = this.amount + amount;
		return amount;
	}
	
	@Override
	public double calMaturityAmount() {
		double amount = 0;
		amount = this.amount + (this.amount * INTEREST);
		return amount;
	}
	
	@Override
	public String toString() {
		return super.toString() + "FD [ maturity amount = " + this.amount + " ]";
	}
}
