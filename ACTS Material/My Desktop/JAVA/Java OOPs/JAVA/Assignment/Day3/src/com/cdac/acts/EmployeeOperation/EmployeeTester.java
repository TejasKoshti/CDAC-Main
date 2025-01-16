package com.cdac.acts.EmployeeOperation;

public class EmployeeTester {
	
	private int empId;
	private String empName;
	private String dept;
	private double salary;
	
	private static int idGenerator = 007;
	
	public EmployeeTester()
	{
		this.empId = idGenerator++;
		this.empName = "";
		this.dept = " ";
		this.salary = 0.0;
	}
	
	public EmployeeTester(String empName, String dept, double salary)
	{
		this.empId = idGenerator++;
		this.empName = empName;
		this.dept =dept;
		this.salary = salary;
	}
	public void printData()
	{
		System.out.println("Employee = [ "+ "EmpID = "+empId+", EmpName = "+empName+", Dept = "+dept+", salary = "+salary+"]");
	}
	

}
