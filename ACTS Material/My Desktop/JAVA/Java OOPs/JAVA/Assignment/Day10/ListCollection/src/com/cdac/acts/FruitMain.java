package com.cdac.acts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FruitMain {
	public static void main(String[] args) {
		
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		
		Scanner sc = new Scanner(System.in);

		int choice = 0;
		
		do {
			
			System.out.println("Menu");
			System.out.println("1. Add Eelements: ");
			System.out.println("2. Remove Eelements: ");
			System.out.println("3. Display Eelements: ");
			System.out.println("4. Exit ");
			System.out.println("Enter the choice: ");
			
			
			switch(choice =sc.nextInt()){
				case 1: 
				{
					sc.nextLine();
					System.out.println("Enter The Name : ");
					String name = sc.nextLine();
					System.out.println("Enter The color: ");
					String color = sc.nextLine();
					System.out.println("enter the Price: ");
					double price = sc.nextDouble();
					System.out.println("Enter The Quanty: ");
					int quantity = sc.nextInt();
	
					
						fruitList.add(new Fruit(name, color, price,quantity));
						fruitList.forEach(System.out::println);
				
				}break;
				
				case 2: 
				{
					System.out.println("Enter The Number you want to remove: ");
					
						sc.nextLine();
						fruitList.remove(sc.nextInt());
						fruitList.forEach(System.out::println);
					
				}break;
				
				case 3: 
				{
					fruitList.forEach(System.out::println);
				}break;
				case 4: 
				{
					System.out.println("Exit");
				}break;
			}
		}while(choice != 3);
		
		sc.close();
	}
}
