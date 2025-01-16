package com.cdac.acts.account;

import java.util.Date;

import com.cdac.acts.date_utils.MyDate;

public abstract class Account {
	private long accNo;
	private String name;
	private Date date;
	
	private static long idGenerator = 20240991001L;
	
	public Account() {
		this.accNo = idGenerator;
		this.name = "";
		this.date = null;
		idGenerator++;
	}
	
	public Account(String name, Date date) {
		this.accNo = idGenerator;
		this.name = name;
		this.date = date;
		idGenerator++;
	}
	
	public abstract double applyInterest();

	@Override
	public String toString() {
		return "Account [accNo: " + accNo + ", name: " + name + ", Date: " +MyDate.setDateFormat(date)+"]";
	}
	
}
