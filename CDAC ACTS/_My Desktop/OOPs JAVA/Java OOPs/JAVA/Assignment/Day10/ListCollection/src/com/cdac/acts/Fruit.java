package com.cdac.acts;

public class Fruit {
	
	private String name;
	private String color;
	private double price;
	private int quantity;
	
	public Fruit(String name, String color, double price, int quantity) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	@Override
	public String toString() {
		return "Fruit [name=" + name + ", color=" + color + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	

}
