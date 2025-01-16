package com.cdac.acts.fruit.main;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ListIterator;

import com.cdac.acts.fruit.Fruit;

public class Main {

	public static void main(String[] args) {
		
		//Collection I/F -> List I/F -> ArrayList CC(Concrete Class)
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>(); 
		int count = 0;
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("1 -> add");
			System.out.println("2 -> remove");
			System.out.println("3 -> display using advance for loop");
			System.out.println("4 -> display using for each loop");
			System.out.println("5 -> display using forward iterator");
			System.out.println("6 -> display using backward iterator");
			System.out.println("0 -> exit");
		
			System.out.println("enter choice");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			
			case 1:
			{
				System.out.println("Enter Fruit Name");
				String name = sc.nextLine();
		
				System.out.println("Enter Color");
				String color = sc.nextLine();
		
				System.out.println("Enter Price");
				double price = sc.nextDouble();
				
				System.out.println("Enter Quantity");
				int quantity = sc.nextInt();
				fruitList.add(count, new Fruit(name, color, price, quantity));
				count++;
				System.out.println("added successfully");
			}break;
			
			case 2:
			{
				System.out.println("Enter Fruit Name from list to remove");
				String name = sc.nextLine();
			
				for (int i = 0; i < count; i++) {
					if (name.equals(fruitList.get(i).getName())) {
						fruitList.remove(i);
						count--;
						System.out.println("remove successfully "+ name);
					}
				}
				
				
			} break;
			
			case 3:
			{
				for(Fruit fruit : fruitList) {
					System.out.println(fruit);
				}
			}break;
			
			case 4:
			{
				fruitList.forEach(System.out::println);
			}break;
			
			case 5:
			{
				ListIterator<Fruit> lif = fruitList.listIterator();
				while (lif.hasNext()) {
					System.out.println(lif.next());
				}
			}break;
			
			case 6: 
			{
				ListIterator<Fruit> lib = fruitList.listIterator(count);
				while (lib.hasPrevious()) {
					System.out.println(lib.previous());
				}
			} break;
			
			case 0:
			{
				sc.close();
				System.exit(0);
			}
			}
		}
	}
}
