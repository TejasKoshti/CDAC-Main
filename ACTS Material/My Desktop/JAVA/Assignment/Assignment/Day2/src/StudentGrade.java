/* Write a Java program to allot grade student grade based on below
conditions
Up to 50% pass class
Up to 60% second class
Up to 75% First class
Above 75% Distinction.*/

import java.util.Scanner;

public class StudentGrade
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Marks of Subject 1: ");
		int marks1 = sc.nextInt();
		System.out.println("Enter the Marks of Subject 2: ");
		int marks2 = sc.nextInt();
		System.out.println("Enter the Marks of Subject 3: ");
		int marks3 = sc.nextInt();
		System.out.println("Enter the Marks of Subject 4: ");
		int marks4 = sc.nextInt();
		System.out.println("Enter the Marks of Subject 5: ");
		int marks5 = sc.nextInt();
		
		int marks = marks1 + marks2 + marks3 + marks4 + marks5;
		double grades = (marks/500.0)*100;
		
		if(grades >75)
		{
				System.out.println("Distinction");
		}
		else if(grades>=60)
		{
			System.out.println("First class");
		}
		else if(grades>=50)
		{
			System.out.println("second class");
		}
		else if(grades>=35)
		{
			System.out.println("pass class");
		}
		else
		{
			System.out.println("Sorry , Fails !!");	
		}
	}
}