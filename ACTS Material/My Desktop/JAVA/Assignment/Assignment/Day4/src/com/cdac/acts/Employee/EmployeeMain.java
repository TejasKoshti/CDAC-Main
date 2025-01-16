package com.cdac.acts.Employee;

import java.util.Scanner;

public class EmployeeMain {

	// Main Method
	public static void main(String[] args) {
		
		// Array Declaration
		EmployeeOperation eArr[] = new EmployeeOperation[5];
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int count = 0;
		do {
			System.out.println("********MENU********");
			System.out.println("1.Add Employee");
			System.out.println("2.Display Employee by ID");
			System.out.println("3.Display All Employee Data ");
			System.out.println("4.Sort Employee by Salary");
			System.out.println("5.Exit");
			choice = sc.nextInt();
			
			// Switch case
			switch(choice) {
			// Add Employee
			case 1:{
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Dept: ");
				String dept = sc.nextLine();
				System.out.println("Enter Salary: ");
				double salary = sc.nextDouble();
				
				EmployeeOperation employee = new EmployeeOperation(name, dept, salary);
				eArr[count] = employee;
				System.out.println("Cong, Your emp Id Is This:"+employee.getEmpId());
				count++;	
			}break;
			
			// Display Employee by ID
			case 2:{
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				boolean found = false;
				
				for(int i=0; i < count && !found ; i++) {
					
					if(eArr[i].getEmpId() == id) {
						
						System.out.println("Employee found");
						eArr[i].printData();
						found = true;
					}
				} 
					if(!found) {
						System.out.println("Employee not found");
					}
				}break;
				
			// Display All Employee Data
			case 3:{
                    for(int i=0; i < count  ; i++) {
						System.out.println("Employee found");
						eArr[i].printData();
				} 
			}break;
			
			// Sort Employee by Salary
			case 4:{
				 int i, j;
				 EmployeeOperation temp;
			        boolean swapped;
			        for (i = 0; i < count - 1; i++) {
			            swapped = false;
			            for (j = 0; j < count - i - 1; j++) {
			                if (eArr[j].getSalary() > eArr[j+1].getSalary()) {
			                   
			                    temp = eArr[j];
			                    eArr[j] = eArr[j + 1];
			                    eArr[j + 1] = temp;
			                    swapped = true;
			                }
			            }
			            // If no two elements were
			            // swapped by inner loop, then break
			            if (swapped == false)
			                break;
			        }
			        for(int k=0; k < count  ; k++) {
			    		
						System.out.println("Employee found");
						eArr[k].printData();
				} 
		     }break;
			
		     default:
			  break;
			
			
			}
		}while(choice!=5);
		sc.close();
	}
}
