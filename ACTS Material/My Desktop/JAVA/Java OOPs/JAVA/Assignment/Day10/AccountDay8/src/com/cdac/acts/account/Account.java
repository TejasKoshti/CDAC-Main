package com.cdac.acts.account;

import java.util.Date;

import com.cdac.acts.date_utils.MyDate;

public abstract class Account {

	private String accNo = "SBI";
	private String name;
	private Date doj;
	
	private static int idGenerator = 10001;
	
	public Account(String name, Date doj) {
		this.accNo = accNo + idGenerator;
		this.name = name;
		this.doj = doj;
		idGenerator++;
	}
	
	public String getAccNo() {
		return this.accNo;
	}
	
	public abstract double calInterest();
	
	public String toString() {
		return  "Account = [ accNo = " + this.accNo + ", name = " + this.name
				+ ", Date = " + MyDate.setDateFormat(doj) +"]";
	}	
}
