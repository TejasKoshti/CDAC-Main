package com.cdac.acts.account;

import java.time.LocalDate;
import java.util.List;

import com.cdac.acts.account.exception.MinBalanceException;

public class Account implements Comparable<Account> {
	private Integer accNo;
	private String name;
	private LocalDate opening;
	private Double balance;

	private static Integer idGenerator = 10001;
	
	private static final float INTEREST = 0.01f;

	public Account(String name, LocalDate opening, Double balance) {
		this.accNo = idGenerator;
		this.name = name;
		this.opening = opening;
		this.balance = balance;
		idGenerator++;
	}

	public Integer getAccNo() {
		return this.accNo;
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getOpening() {
		return this.opening;
	}

	public Double getBalance() {
		return this.balance;
	}
	
	public void witdraw(Double amount) throws MinBalanceException {
		this.balance = this.balance - amount;
		if (this.balance < 1000) {
			throw new MinBalanceException("minimum balance should be atleast 1000");
		}
	}
	
	public void deposite(Double amount) {
		this.balance = this.balance + amount;
	}

	

	public static boolean found(List<Account> list , Integer acc) {
		for (int i = 0; i < list.size(); i++) {
			if (acc.equals(list.get(i).getAccNo())) {
				return true;
			}
		}
		return false;
	}
	
	public static Account findAccount(List<Account> list, Integer acc) {
		for (int i = 0; i < list.size(); i++) {
			if (acc.equals(list.get(i).getAccNo())) {
				return list.get(i);
			}
		}
		return null;
	}
	
	public void applyInterest() {
		this.balance = this.balance + (this.balance * INTEREST);
	}
	
	@Override
	public int compareTo(Account a) {
		return a.getAccNo().compareTo(this.getAccNo());
	}
	
	@Override
	public String toString() {
		return "Account [ accNo: " + this.accNo + ", Name: " + this.name + ", Date of Opening: " + this.opening
				+ ", Balance: " + this.balance + " ]";
	}

	
}
