package com.cdac.acts.account.validation;

import java.time.LocalDate;

import com.cdac.acts.account.enums.AccountType;
import com.cdac.acts.account.my_Exception.MiniBalException;

public class Validation {
	private Validation() {}
	
	public static AccountType getValidAccountType(String acc) {
	
		AccountType a = null;
		try {
			a = AccountType.valueOf(acc);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		return a;
	}
	
	public static LocalDate getValidDoj(String strDoj) {
		LocalDate doj = LocalDate.parse(strDoj);
		
		LocalDate today = LocalDate.now();
		LocalDate requiredDate = today.minusDays(1);
		
		if (doj.isBefore(requiredDate)) {
			return doj;
		}
		
		return null;
	}
	
	public static Double getValidBalance(double amount) {
		try {
			if (amount < 1000) {
				throw new MiniBalException("minimum balance should be atleast 1000");
			}
		} catch (MiniBalException e) {
			e.printStackTrace();
		}
		return amount;
	}
}
