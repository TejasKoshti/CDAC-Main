package com.cdac.acts.accounta;

import java.time.LocalDate;
import java.util.List;

import com.cdac.acts.account.exception.MiniBalException;


public class Account implements Comparable<Account>{
		private Integer accNo;
		private String name;
		private LocalDate opening;
		private Double balance;
		
		private Integer generateId = 10000;
		
		public static final float INTREST = 0.01f;

		public Account( String name, LocalDate opening, Double balance) {
			super();
			this.accNo = generateId;
			this.name = name;
			this.opening = opening;
			this.balance = balance;
			generateId++;
		}

		public Integer getAccNo() {
			return accNo;
		}

		public String getName() {
			return name;
		}

		public LocalDate getOpening() {
			return opening;
		}

		public Double getBalance() {
			return balance;
		}

		
		public void deposite (double amount) {
			this.balance = this.balance + amount;
			
		}
		
		public void withdraw(double amount) throws MiniBalException {
			
			this.balance =  this.balance - amount;
			if(balance < 1000) {
				throw new MiniBalException("Blacce shiudb gte 1000");
			}
		}
		
		public static boolean found(List<Account> list , Integer acc) {
			
			for(int i = 0; i < list.size(); i++) {
				if(acc.equals(list.get(i).getAccNo())) {
					return true;
				}
			}
			return false;
		}
		
		public static Account findAccount(List<Account> list, Integer acc) {
			
			for(int i = 0; i< list.size(); i++) {
				if(acc.equals(list.get(i).getAccNo())) {
					return list.get(i);
				} 
			}
			return null;
		}
		
		public void addIntrest() {
			this.balance =  this.balance + (this.balance*INTREST);
		}
		

		public int compareTo(Account a) {
			return a.getAccNo().compareTo(this.getAccNo());
		}
		
		
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", name=" + name + ", opening=" + opening + ", balance=" + balance
					+ ", generateId=" + generateId + "]";
		}
		
		
		
		
		
}
