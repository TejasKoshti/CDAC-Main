package com.cdac.acts;

import java.time.LocalDate;

public class Person {
    private String aadharNumber;
    private String name;
    private LocalDate dateOfBirth;
    private Gender gender; 
    private Address address; 

    public Person(String aadharNumber, String name, LocalDate dateOfBirth, Gender gender, Address address) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

    public boolean isBornBeforeAugust1947() {
        LocalDate referenceDate = LocalDate.of(1947, 8, 15);
        return dateOfBirth.isBefore(referenceDate);
    }

    // Getters and toString method
    public String getAadharNumber() { return aadharNumber; }
    public String getName() { return name; }
    public LocalDate getDateOfBirth() { return dateOfBirth; }
    public Gender getGender() { return gender; }
    public Address getAddress() { return address; }

    @Override
    public String toString() {
        return "Name: " + name + ", Aadhar: " + aadharNumber + ", DOB: " + dateOfBirth + 
               ", Gender: " + gender + ", Address: " + address;
    }
}
