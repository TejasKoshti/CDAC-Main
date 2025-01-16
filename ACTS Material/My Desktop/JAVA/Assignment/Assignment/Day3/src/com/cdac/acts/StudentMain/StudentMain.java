package com.cdac.acts.StudentMain;

import java.util.Scanner;


import com.cdac.acts.Student.Student;


public class StudentMain {

	public static void main(String[] args) {
		Student student = new Student();
		student.printData();
		Scanner scanner = new Scanner(System.in);

//		System.out.println("Enter the Emoployee Id :");
//		int empId = scanner.nextInt();

		scanner.nextLine();
		System.out.println("Enter the Emoployee Name :");
		String sName = scanner.nextLine();

		

		System.out.println("Enter the Emoployee salary :");
		double marks = scanner.nextDouble();

		Student student2 = new Student(sName, marks);
		student2.printData();

		scanner.close();


	}

}
