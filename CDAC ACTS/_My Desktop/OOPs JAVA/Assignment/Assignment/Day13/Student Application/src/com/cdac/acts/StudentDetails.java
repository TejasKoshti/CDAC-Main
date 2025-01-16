package com.cdac.acts;

public class StudentDetails {
    private Integer rollNo;
    private String name;
    private String standard;
    private Integer division;

    public StudentDetails(Integer rollNo, String name, String standard, Integer division) {
        this.rollNo = rollNo;
        this.name = name;
        this.standard = standard;
        this.division = division;
    }

    // Getters and toString method
    @Override
    public String toString() {
        return "StudentDetails [rollNo=" + rollNo + ", name=" + name + ", standard=" + standard + ", division=" + division + "]";
    }

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
    
    
}
