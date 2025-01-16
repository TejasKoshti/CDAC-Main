package com.cdac.acts;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Pune", "Maharashtra", "400001");
        Person person = new Person("1234-5678-9101", "Tejas", LocalDate.of(1946, 5, 20), 
                                   Gender.MALE, address);

        System.out.println(person);
        System.out.println("Born before August 15, 1947: " + person.isBornBeforeAugust1947());
    }
}
