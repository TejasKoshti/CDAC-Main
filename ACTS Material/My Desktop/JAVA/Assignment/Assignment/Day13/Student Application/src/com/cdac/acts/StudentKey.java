package com.cdac.acts;

import java.util.Objects;

public class StudentKey {
	
	private String standard;
	private Integer division;
	private Integer rollNo;
	
	public StudentKey(String standard, Integer division, Integer rollNo) {
		super();
		this.standard = standard;
		this.division = division;
		this.rollNo = rollNo;
	}
	@Override
	public int hashCode() {
		return Objects.hash(division, rollNo, standard);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentKey other = (StudentKey) obj;
		return Objects.equals(division, other.division) && Objects.equals(rollNo, other.rollNo)
				&& Objects.equals(standard, other.standard);
	}
	@Override
	public String toString() {
		return "StudentKey [standard=" + standard + ", division=" + division + ", rollNo=" + rollNo + "]";
	}
	
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public Integer getDivision() {
		return division;
	}
	public void setDivision(Integer division) {
		this.division = division;
	}
	public Integer getRollNo() {
		return rollNo;
	}
	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}
	

}
