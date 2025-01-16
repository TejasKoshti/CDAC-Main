package com.cdac.acts.employeeMain;

import com.cdac.acts.EmployeeOperation.EmployeeTester;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {

		EmployeeTester employeeTester = new EmployeeTester();
		employeeTester.printData();
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Enter the Emoployee Id :");
//		int empId = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter the Emoployee Name :");
		String empName = scanner.nextLine();

		System.out.println("Enter the Emoployee Dept :");
		String dept = scanner.nextLine();

		System.out.println("Enter the Emoployee salary :");
		double salary = scanner.nextDouble();

		EmployeeTester employeeTester2 = new EmployeeTester(empName, dept, salary);
		employeeTester2.printData();

		scanner.close();

	}

}
