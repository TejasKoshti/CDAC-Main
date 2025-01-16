package com.cdac.actss;

import java.util.Date;
import java.util.Objects;

public class PermanetEmployee extends Employee{

	
	private double basicSal;
	private double incetive;
	private double speacialAlloewwa;
	
	public PermanetEmployee(int empId, String name, String title, Date doj, double basicSal, double incetive,
			double speacialAlloewwa) {
		super(empId, name, title, doj);
		this.basicSal = basicSal;
		this.incetive = incetive;
		this.speacialAlloewwa = speacialAlloewwa;
	}
	
	public double calculateSalary() {
		System.out.println("Permant Sakalry");
		return basicSal + speacialAlloewwa + incetive;
	}
	
	public double getBounus() {
		System.out.println("Perm Bounus");
		return (10 * basicSal)/100;
	}

	public double getBasicSal() {
		return basicSal;
	}

	public void setBasicSal(double basicSal) {
		this.basicSal = basicSal;
	}

	public double getIncetive() {
		return incetive;
	}

	public void setIncetive(double incetive) {
		this.incetive = incetive;
	}

	public double getSpeacialAlloewwa() {
		return speacialAlloewwa;
	}

	public void setSpeacialAlloewwa(double speacialAlloewwa) {
		this.speacialAlloewwa = speacialAlloewwa;
	}

	@Override
	public String toString() {
		return "PermanetEmployee [basicSal=" + basicSal + ", incetive=" + incetive + ", speacialAlloewwa="
				+ speacialAlloewwa + "]";
	}
	
	public static int getCurrentEmpId() {
		return 200;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(basicSal, incetive, speacialAlloewwa);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PermanetEmployee other = (PermanetEmployee) obj;
		return Double.doubleToLongBits(basicSal) == Double.doubleToLongBits(other.basicSal)
				&& Double.doubleToLongBits(incetive) == Double.doubleToLongBits(other.incetive)
				&& Double.doubleToLongBits(speacialAlloewwa) == Double.doubleToLongBits(other.speacialAlloewwa);
	}
	
	
	
	
	

}
