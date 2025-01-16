package com.cdac.acts.Student;

public class StudentOperation {

	private int sId;
	private String sName;
	private String course;
	private double marks;
	
	private static int idGenerator = 1000;
	

	
	public StudentOperation(String sName, String course, double marks)
	{
		this.sId = idGenerator--;
		this.sName = sName;
		this.course =course;
		this.marks = marks;
	}
	
	public int getStuId() {
		return sId;
	}
	
	public double getMarks() {
		return marks;
	}
	
	public void printData() {
		System.out.println(this);
		System.out.println("Student[StudentId=" + sId 
				+ " Student name=" + sName + " course=" + course
				+ " marks=" + marks + "]");
	}
	
	
}
