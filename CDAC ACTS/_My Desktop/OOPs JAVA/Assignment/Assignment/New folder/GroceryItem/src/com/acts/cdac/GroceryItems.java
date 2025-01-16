package com.acts.cdac;

import java.time.LocalDateTime;

public class GroceryItems {
    private String name;
    private Double price;
    private Integer quantity;
    private LocalDateTime stockUpdateDateTime;

    public GroceryItems(String name, Double price, Integer quantity, LocalDateTime stockUpdateDateTime) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.stockUpdateDateTime = stockUpdateDateTime;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public LocalDateTime getStockUpdateDateTime() {
        return stockUpdateDateTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setStockUpdateDateTime(LocalDateTime stockUpdateDateTime) {
        this.stockUpdateDateTime = stockUpdateDateTime;
    }

    @Override
    public String toString() {
        return "GroceryItems [name=" + name + ", price=" + price + ", quantity=" + quantity + ", stockUpdateDateTime="
                + stockUpdateDateTime + "]";
    }
}
