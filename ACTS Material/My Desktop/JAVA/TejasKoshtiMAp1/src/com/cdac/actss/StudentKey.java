package com.cdac.actss;

import java.util.Objects;

public final class StudentKey {
	
	private final String std;
	private final Integer div;
	private final Integer rollNo;
	
	public StudentKey(String std, Integer div, Integer rollNo) {
		super();
		this.std = std;
		this.div = div;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "StudentKey [std=" + std + ", div=" + div + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(div, rollNo, std);
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
		return Objects.equals(div, other.div) && Objects.equals(rollNo, other.rollNo) && Objects.equals(std, other.std);
	}

	public String getStd() {
		return std;
	}

	public Integer getDiv() {
		return div;
	}

	public Integer getRollNo() {
		return rollNo;
	}
	
	
	
	
	
	

}
