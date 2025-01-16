package com.cdac.acts;

import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String itemCode;
    private String itemName;
    private double price;
    private int quantity;

    public Item(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return "Item Code: " + itemCode + ", Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class BillingSystem {
    private static Item[] stockItems;
    private static ArrayList<Item> purchasedItems;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeStock();
        purchasedItems = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display Stock");
            System.out.println("2. Buy Item by Item Code");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayStock();
                    break;
                case 2:
                    buyItem();
                    break;
                case 3:
                    displayBill();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void initializeStock() {
        stockItems = new Item[] {
            new Item("101", "Apple", 0.99, 50),
            new Item("102", "Banana", 0.59, 100),
            new Item("103", "Orange", 0.79, 75),
            new Item("104", "Milk", 1.49, 30),
            new Item("105", "Bread", 2.49, 20)
        };
    }

    private static void displayStock() {
        System.out.println("Stock Items:");
        for (Item item : stockItems) {
            System.out.println(item);
        }
    }

    private static void buyItem() {
        System.out.print("Enter item code to purchase: ");
        String itemCode = scanner.nextLine();
        for (Item item : stockItems) {
            if (item.getItemCode().equals(itemCode)) {
                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                if (quantity > item.getQuantity()) {
                    System.out.println("Not enough stock available.");
                } else {
                    item.reduceQuantity(quantity);
                    purchasedItems.add(new Item(item.getItemCode(), item.getItemName(), item.getPrice(), quantity));
                    System.out.println("Purchased " + quantity + " of " + item.getItemName());
                }
                return;
            }
        }
        System.out.println("Item code not found.");
    }

    private static void displayBill() {
        System.out.println("\nBill:");
        double total = 0.0;
        for (Item item : purchasedItems) {
            double itemTotal = item.getPrice() * item.getQuantity();
            total += itemTotal;
            System.out.println(item.getItemName() + " x " + item.getQuantity() + " @ " + item.getPrice() + " = " + itemTotal);
        }
        System.out.println("Total Amount: $" + total);
    }
}

