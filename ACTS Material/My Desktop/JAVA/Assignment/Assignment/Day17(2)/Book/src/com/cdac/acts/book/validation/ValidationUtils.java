package com.cdac.acts.book.validation;

import java.time.LocalDate;

import com.cdac.acts.book.enums.BookType;

public class ValidationUtils {
	private ValidationUtils() {
	}

	public static BookType getValidCourse(String bookType) {
		BookType bookEnum = null;
		try {
			bookEnum = BookType.valueOf(bookType);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		return bookEnum;
	}

	public static LocalDate getPublishDate(String strDob) {
		LocalDate publishedDate = LocalDate.parse(strDob);
		LocalDate today = LocalDate.now();

		if (publishedDate.isBefore(today)) {
			return publishedDate;
		}
		return null;
	}
}
