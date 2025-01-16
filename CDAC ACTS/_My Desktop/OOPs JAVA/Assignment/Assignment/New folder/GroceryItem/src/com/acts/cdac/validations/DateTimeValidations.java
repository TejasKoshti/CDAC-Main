package com.acts.cdac.validations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateTimeValidations {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyy'T'HH:mm");

    public static LocalDateTime validateDateTime(String stockUpdateDateTime) {
        try {
            LocalDateTime userDate = LocalDateTime.parse(stockUpdateDateTime, formatter);
            LocalDateTime now = LocalDateTime.now();

            if (userDate.isBefore(now)) {
                return userDate; // Valid date
            } else {
                System.out.println("The date and time must be in the past.");
                return null; // Invalid date
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date/time format. Please use the format DD-MM-YYYYTHH:MM.");
            return null; // Invalid date format
        }
    }
}
