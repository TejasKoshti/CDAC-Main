package com.cdac.actss;

import java.util.Date;

public class ContreactEmployee extends Employee{

	private double dailyRate;
	private int noOfDays;
	
	public ContreactEmployee(int empId, String name, String title, Date doj, double dailyRate, int noOfDays) {
		super(empId, name, title, doj);
		this.dailyRate = dailyRate;
		this.noOfDays = noOfDays;
	}

	public double getDailyRate() {
		return dailyRate;
	}

	public void setDailyRate(double dailyRate) {
		this.dailyRate = dailyRate;
	}

	public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	@Override
	public String toString() {
		return "ContreactEmployee [dailyRate=" + dailyRate + ", noOfDays=" + noOfDays + "]";
	}
	
	
	public static int getCurrentEmpId() {
		return 300;
	}
	
	public double calculateSalary() {
		System.out.println("Contract Sakalry");
		return dailyRate * noOfDays;
	}
	
	
}
