package com.cdac.acts.student;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentOperation sArr[] = new StudentOperation[5];
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		int count = 0;
		do {
			System.out.println("********MENU********");
			System.out.println("1. Add Student");
			System.out.println("2. Print Student by rollNo");
			System.out.println("3. Display ");
			System.out.println("4. Print All students Sorted by Marks");
			System.out.println("5. exit");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:{
				sc.nextLine();
				System.out.println("Enter Name: ");
				String name = sc.nextLine();
				System.out.println("Enter Course: ");
				String  course = sc.nextLine();
				System.out.println("Enter marks: ");
				double marks = sc.nextDouble();
				
				StudentOperation student = new StudentOperation(name, course, marks);
				sArr[count] = student;
				System.out.println("Cong, Your student Id Is This:"+student.getStuId());
				count++;
				
			}break;
			case 2:{
				
				System.out.println("Enter ID: ");
				int id = sc.nextInt();
				boolean found = false;
				
				for(int i=0; i < count && !found ; i++) {
					
					if(sArr[i].getStuId() == id) {
						
						System.out.println("Student found");
						System.out.println( sArr[i].toString());
						found = true;
					}
				} 
					if(!found) {
						
						System.out.println("Student not found");
					}
				}break;
			case 3:{
                    for(int i=0; i < count  ; i++) {
		
						System.out.println("Student found");
						System.out.println( sArr[i].toString());
				} 
				
			}break;
			case 4:{
				 int i, j;
				 StudentOperation temp;
			        boolean swapped;
			        for (i = 0; i < count - 1; i++) {
			            swapped = false;
			            for (j = 0; j < count - i - 1; j++) {
			                if (sArr[j].getMarks() > sArr[j+1].getMarks()) {
			                    
			                  
			                    temp = sArr[j];
			                   sArr[j] = sArr[j + 1];
			                    sArr[j + 1] = temp;
			                    swapped = true;
			                }
			            }

			      
			            if (swapped == false)
			                break;
			        }
			        
			        for(int k=0; k < count  ; k++) {
			    		
						System.out.println("Student found");
						System.out.println( sArr[k].toString());
				} 
			
		}break;
			default:
				break;
			
			
			}
		}while(choice!=5);

		sc.close();
	}

}
