package com.acts.pojo;

import java.time.LocalDate;

public class Account {
public static final String EMPTY_STRING = "";
	
	private Integer accNo;
	private String accName;
	private Double balances;
	//New feature java 8 (yyyy-MM-dd)
	private LocalDate dop;
	private Address cutoAddress;
	
	public Account(Integer accNo, String accName, Double balances, LocalDate dop, Address cutoAddress) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balances = balances;
		this.dop = dop;
		this.cutoAddress = cutoAddress;
	}
	
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public Double getBalances() {
		return balances;
	}
	public void setBalances(Double balances) {
		this.balances = balances;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	public Address getCutoAddress() {
		return cutoAddress;
	}
	public void setCutoAddress(Address cutoAddress) {
		this.cutoAddress = cutoAddress;
	}
	public static String getEmptyString() {
		return EMPTY_STRING;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balances=" + balances + ", dop=" + dop
				+ ", cutoAddress=" + cutoAddress + "]";
	}
	
	
	
	
	
	
	
	
	
}
