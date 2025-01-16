package com.cdac.acts.account.validation;

import java.time.LocalDate;

import com.cdac.acts.account.exception.MinBalanceException;

public class Validation {
	private Validation() {
	}

	public static Double miniBal(Double amount) {
		try {
			if (amount < 1000) {
				throw new MinBalanceException("Minimum Balance should be thousand");
			}
		} catch (MinBalanceException e) {
			e.printStackTrace();
			return 0.0;
		}
		return amount;
	}
	
	public static LocalDate getValidOpening(String strDoj) {
		LocalDate opening = LocalDate.parse(strDoj);
		
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusDays(1);
		
		if (opening.isBefore(requiredDate)) {
			return opening;
		}
		
		return null;
	}
}
