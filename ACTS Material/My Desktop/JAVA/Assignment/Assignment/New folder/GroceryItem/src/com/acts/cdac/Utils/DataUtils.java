package com.acts.cdac.Utils;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.acts.cdac.GroceryItems;

public class DataUtils {
    // Create a list to hold grocery items
    static List<GroceryItems> groceryItems = new ArrayList<>();

    // Method to retrieve the grocery items
    public static List<GroceryItems> getGroceryItems() {
        if (groceryItems.isEmpty()) {
            // Prepopulate the list
            groceryItems.add(new GroceryItems("Sugar", 40.0, 15, LocalDateTime.of(2024, 10, 1, 10, 0)));
            groceryItems.add(new GroceryItems("Flour", 30.0, 10, LocalDateTime.of(2024, 10, 2, 12, 30)));
            groceryItems.add(new GroceryItems("Rice", 50.0, 20, LocalDateTime.of(2024, 10, 3, 14, 45)));
            groceryItems.add(new GroceryItems("Salt", 15.0, 25, LocalDateTime.of(2024, 10, 4, 9, 15)));
            groceryItems.add(new GroceryItems("Olive Oil", 120.0, 5, LocalDateTime.of(2024, 10, 5, 11, 30)));
            groceryItems.add(new GroceryItems("Pasta", 60.0, 30, LocalDateTime.of(2024, 10, 6, 13, 0)));
            groceryItems.add(new GroceryItems("Tomato Sauce", 25.0, 10, LocalDateTime.of(2024, 10, 7, 8, 0)));
            groceryItems.add(new GroceryItems("Cheese", 80.0, 8, LocalDateTime.of(2024, 10, 8, 7, 20)));
            groceryItems.add(new GroceryItems("Chicken", 150.0, 12, LocalDateTime.of(2024, 10, 9, 15, 45)));
            groceryItems.add(new GroceryItems("Bread", 20.0, 50, LocalDateTime.of(2024, 10, 10, 16, 10)));
        }
        return groceryItems;
    }
}
