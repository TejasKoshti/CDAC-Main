package com.cdac.acts.Employee;

public class EmployeeOperation {

	// Data Members
	private int empId;
	private String empName;
	private String dept;
	private double salary;
	
	// Auto Number Generator
	private static int idGenerator = 1000;
	
	
	public EmployeeOperation(String empName, String dept, double salary)
	{
		this.empId = idGenerator--;
		this.empName = empName;
		this.dept =dept;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void printData() {
		System.out.println(this);
		System.out.println("Employee[empId=" + empId 
				+ " name=" + empName + " dept=" + dept
				+ " salary=" + salary + "]");
	}
	
}
