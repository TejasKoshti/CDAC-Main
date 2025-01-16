package com.cdac.acts.tester;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap; // Import TreeMap

import com.cdac.acts.StudentDetails_SirMethod;
import com.cdac.acts.StudentKey_SirMethod;

public class HashMapTester_SirMethod {
    public static void main(String[] args) {
        // Change from HashMap to TreeMap
        Map<StudentKey_SirMethod, StudentDetails_SirMethod> studentMap = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        
        int choice = 0;
        do {
            // Displaying menu options
            System.out.println("**************MENU***************");
            System.out.println("1. Add Student Data");
            System.out.println("2. Print all students");
            System.out.println("3. Find student using unique mentioned above {5A, 6B}");
            System.out.println("4. Remove student using Roll No");
            System.out.println("5. Exit");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1: {
                    System.out.println("Enter The Student Roll No:");
                    Integer rollNo = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.println("Enter The Student Name:");
                    String name = sc.nextLine();
                    System.out.println("Enter The Student Division {1, 2, 3}:");
                    Integer division = sc.nextInt();
                    System.out.println("Enter The Student Standard {A, B, C}:");
                    String standard = sc.next();

                    // Create student details and key
                    StudentDetails_SirMethod details = new StudentDetails_SirMethod(standard, division, rollNo, name);
                    studentMap.put(details.getKey(), details);
                    
                    System.out.println("Student Added Successfully ❤️");
                } break;
                
                case 2: {
                    if (studentMap.isEmpty()) {
                        System.out.println("No students in the database.");
                    } else {
                        System.out.println("All Students:");
                        for (StudentDetails_SirMethod student : studentMap.values()) {
                            System.out.println(student);
                        }
                    }
                } break;

                case 3: {
                    System.out.println("Enter Standard (e.g., A, B, C):");
                    String standard = sc.next();               
                    System.out.println("Enter Division (e.g., 1, 2, 3):");
                    Integer division = sc.nextInt();
                    System.out.println("Enter Roll No (e.g., 120, 100, 101):");
                    Integer rollNo = sc.nextInt();
                    
                    // Create the unique key using the standard and division
                    StudentKey_SirMethod key = new StudentKey_SirMethod(standard, division, rollNo);
 
                    // Check if the student exists in the map
                    StudentDetails_SirMethod student = studentMap.get(key);  
                    
                    if (student != null) {
                        System.out.println("Student Found: " + student);
                    } else {
                        System.out.println("No student found with Standard " + standard + " and Division " + division + ".");
                    }
                } break;

                case 4: {
                    System.out.println("Enter Standard (e.g., A, B, C):");
                    String standard = sc.next();               
                    System.out.println("Enter Division (e.g., 1, 2, 3):");
                    Integer division = sc.nextInt();
                    System.out.println("Enter Roll No (e.g., 120, 100, 101):");
                    Integer rollNo = sc.nextInt();
                    
                    // Create the unique key using the standard and division
                    StudentKey_SirMethod key = new StudentKey_SirMethod(standard, division, rollNo);
                    
                    // Check if the student exists in the map
                    StudentDetails_SirMethod student = studentMap.remove(key);  
                    
                    if (student != null) {
                        System.out.println("Student Removed: " + student);
                    } else {
                        System.out.println("No student found with Standard " + standard + " and Division " + division + ".");
                    }
                } break;
                
                case 5:
                    System.out.println("Thank you for Visiting 🙏"); 
                    break;
                    
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        
        sc.close();
    }
}
