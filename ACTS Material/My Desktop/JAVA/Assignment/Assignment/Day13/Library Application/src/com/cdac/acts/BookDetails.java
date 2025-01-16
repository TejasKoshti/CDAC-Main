package com.cdac.acts;

import java.time.LocalDate; // Import LocalDate for date handling
import java.util.Objects;

public class BookDetails {

    private String title;
    private Double price;
    private String authorName;
    private Integer quantity;
    private LocalDate publishedDate; // Added publishedDate field

    private BookType bookType;

    public BookDetails(String title, Double price, String authorName, Integer quantity, BookType bookType, LocalDate publishedDate) {
        this.title = title;
        this.price = price;
        this.authorName = authorName;
        this.quantity = quantity;
        this.bookType = bookType;
        this.publishedDate = publishedDate; // Set published date
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPublishedDate() { // Added getter for publishedDate
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) { // Added setter for publishedDate
        this.publishedDate = publishedDate;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookType, price, quantity, title, publishedDate); // Updated hashCode
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        BookDetails other = (BookDetails) obj;
        return Objects.equals(authorName, other.authorName) &&
               bookType == other.bookType &&
               Objects.equals(price, other.price) &&
               Objects.equals(quantity, other.quantity) &&
               Objects.equals(title, other.title) &&
               Objects.equals(publishedDate, other.publishedDate); // Updated equals
    }

    @Override
    public String toString() {
        return "BookDetails [title=" + title + ", price=" + price + ", authorName=" + authorName + 
               ", quantity=" + quantity + ", bookType=" + bookType + ", publishedDate=" + publishedDate + "]"; // Updated toString
    }
}
