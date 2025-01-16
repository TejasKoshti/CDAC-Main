package com.cdac.acts;

public enum BookType { // Capitalized the enum name to follow Java naming conventions

    ROM("ROMANCE"), 
    MY("MYSTERY"),
    TH("THRILLER"), 
    FI("FICTION"),
    FA("FANTASY");
    
    private String value; // Renamed the variable for clarity
    
    BookType(String value) { // Constructor parameter renamed to match the variable name
        this.value = value; 
    }
    
    public String getValue() {
        return value; // Returning the value
    }
}
