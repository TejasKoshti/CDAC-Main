package com.cdac.acts.Student;

public class Student {

	private int rollNo;
	private String sName;
	
	private double marks;
	
	private static int idGenerator = 007;
	
	public Student()
	{
		this.rollNo = idGenerator++;
		this.sName = "";
		
		this.marks = 0.0;
	}
	
	public Student(String sName, double marks)
	{
		this.rollNo = idGenerator++;
		this.sName = sName;
		
		this.marks = marks;
	}
	public void printData()
	{
		System.out.println("Student = [ "+ "EmpID = "+rollNo+", EmpName = "+sName+",  salary = "+marks+"]");
	}
}
