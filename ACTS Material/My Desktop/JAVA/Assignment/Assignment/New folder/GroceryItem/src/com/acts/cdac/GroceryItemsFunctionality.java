package com.acts.cdac;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import com.acts.cdac.Utils.DataUtils;
import com.acts.cdac.validations.DateTimeValidations;

public class GroceryItemsFunctionality {

    // Add a new grocery item to the list.
	public static void addGroceryItems(List<GroceryItems> groceryItems, Scanner sc) {
	    System.out.println("Enter Item Name: ");
	    String itemName = sc.nextLine().trim();

	    // Check if the item already exists in the list
	    boolean itemExists = groceryItems.stream().anyMatch(item -> item.getName().equalsIgnoreCase(itemName));
	    if (itemExists) {
	        System.err.println("Item already exists in the list. Please enter a different item.");
	        return; // Exit the method if the item exists
	    }

	    Double itemPrice = null;
	    while (itemPrice == null) {
	        System.out.println("Enter Item Price: ");
	        try {
	            itemPrice = Double.parseDouble(sc.nextLine());
	            if (itemPrice < 0) {
	                System.err.println("Price cannot be negative. Please enter a valid price.");
	                itemPrice = null; // Reset for re-entry
	            }
	        } catch (NumberFormatException e) {
	            System.err.println("Invalid input. Please enter a numeric value for price.");
	        }
	    }

	    Integer itemQuantity = null;
	    while (itemQuantity == null) {
	        System.out.println("Enter Item Quantity: ");
	        try {
	            itemQuantity = Integer.parseInt(sc.nextLine());
	            if (itemQuantity < 0) {
	                System.err.println("Quantity cannot be negative. Please enter a valid quantity.");
	                itemQuantity = null; // Reset for re-entry
	            }
	        } catch (NumberFormatException e) {
	            System.err.println("Invalid input. Please enter a numeric value for quantity.");
	        }
	    }

	    LocalDateTime stockUpdateDateTime = null;
	    while (stockUpdateDateTime == null) {
	        System.out.println("Enter Item Date & Time (format: DD-MM-YYYYTHH:MM): ");
	        String userStockUpdateDateTime = sc.nextLine();
	        stockUpdateDateTime = DateTimeValidations.validateDateTime(userStockUpdateDateTime);
	        if (stockUpdateDateTime == null) {
	            System.err.println("Invalid date/time format or not in the past. Please try again.");
	        }
	    }

	    GroceryItems gi = new GroceryItems(itemName, itemPrice, itemQuantity, stockUpdateDateTime);
	    groceryItems.add(gi);
	    System.out.println("Grocery item added successfully.");
	}


    // Retrieve and display the grocery items
    public static void displayGroceryItems(List<GroceryItems> groceryItems) {
        if (groceryItems.isEmpty()) {
            System.out.println("No grocery items to display.");
            return;
        }
        System.out.println("List of Grocery Items:");
        groceryItems.forEach(System.out::println);
        System.out.println("");
    }
    
 // Update the quantity of a grocery item in stock.
    public static void updateGroceryItems(List<GroceryItems> groceryItems, Scanner sc) {
        System.out.println("Enter the name of the item to update: ");
        String itemName = sc.nextLine();
        
        for (GroceryItems item : groceryItems) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                System.out.println("Current quantity: " + item.getQuantity());
                System.out.println("Enter new quantity: ");
                Integer newQuantity = null;

                while (newQuantity == null) {
                    try {
                        newQuantity = Integer.parseInt(sc.nextLine());
                        if (newQuantity < 0) {
                            System.out.println("Quantity cannot be negative. Please enter a valid quantity.");
                            newQuantity = null; // Reset for re-entry
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a numeric value for quantity.");
                    }
                }

                item.setQuantity(newQuantity);
                item.setStockUpdateDateTime(LocalDateTime.now());
                System.out.println("Quantity updated successfully.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Remove all empty stock items.
    public static void removeEmptyStockItems(List<GroceryItems> groceryItems) {
        groceryItems.removeIf(item -> item.getQuantity() == 0);
        System.out.println("Removed all items with zero stock.");
    }

    // Display items updated in the last 3 days.
    public static void displayRecentlyUpdatedItems(List<GroceryItems> groceryItems) {
        LocalDateTime threeDaysAgo = LocalDateTime.now().minusDays(3);
        System.out.println("Items updated in the last 3 days:");

        groceryItems.stream()
            .filter(item -> item.getStockUpdateDateTime().isAfter(threeDaysAgo))
            .forEach(System.out::println);
    }

    // Retrieve and display the grocery items
//    public static void displayGroceryItems1(List<GroceryItems> groceryItems) {
//        if (groceryItems.isEmpty()) {
//            System.out.println("No grocery items to display.");
//            return;
//        }
//        System.out.println("List of Grocery Items:");
//        groceryItems.forEach(System.out::println);
//        System.out.println("");
//    }
}

