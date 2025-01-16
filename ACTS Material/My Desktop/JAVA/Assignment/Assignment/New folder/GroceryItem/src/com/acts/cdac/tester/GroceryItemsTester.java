package com.acts.cdac.tester;

/*
Q1.Develop a java program to manage a list of grocery items.Each grocery item should have the following
attributes:
Name
Price per unit
Quantity in stock
Stock update date and time((it changed every time when quantity changes) [15 Marks]
Your program should provide the following functionalities:
1. Add a new grocery item to the list. [5 Marks]
2. Update the quantity of a grocery item in stock. [15 Marks]
3. Display the list of grocery items including their name,prices and quantities. [5 Marks]
4. Remove all empty stock items.(quantity in stock is zero). [10 Marks]
5. Display all products for which stock updated(quantity changed)in last 3 days.
*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.acts.cdac.GroceryItems;
import com.acts.cdac.GroceryItemsFunctionality;
import com.acts.cdac.Utils.DataUtils;

public class GroceryItemsTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<GroceryItems> groceryItems = DataUtils.getGroceryItems();

        int choice = 0;

        do {
            System.out.println("Choose from following choices provide: \n"
                    + "1. Add a new grocery item to the list. \r\n"
                    + "2. Update the quantity of a grocery item in stock. \r\n"
                    + "3. Display the list of grocery items including their name, prices and quantities. \r\n"
                    + "4. Remove all empty stock items (quantity in stock is zero). \r\n"
                    + "5. Display all products for which stock updated (quantity changed) in last 3 days. \r\n"
                    + "0. Exit");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 0: {
                    System.out.println("Exit...");
                }
                break;
                case 1: {
                    // Add
                    GroceryItemsFunctionality.addGroceryItems(groceryItems, sc);
                }
                break;
                case 2: {
                    // Update
                    GroceryItemsFunctionality.updateGroceryItems(groceryItems, sc);
                }
                break;
                case 3: {
                    // Display
                    GroceryItemsFunctionality.displayGroceryItems(groceryItems);
                }
                break;
                case 4: {
                    // Remove empty stock items
                    GroceryItemsFunctionality.removeEmptyStockItems(groceryItems);
                }
                break;
                case 5: {
                    // Display recently updated items
                    GroceryItemsFunctionality.displayRecentlyUpdatedItems(groceryItems);
                }
                break;
            }

        } while (choice != 0);

        sc.close();
    }
}
