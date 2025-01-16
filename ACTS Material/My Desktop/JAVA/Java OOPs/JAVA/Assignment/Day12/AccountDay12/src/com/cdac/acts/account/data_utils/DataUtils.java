package com.cdac.acts.account.data_utils;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;

import com.cdac.acts.account.Account;
import com.cdac.acts.account.validation.Validation;
import com.cdac.acts.account.exception.MinBalanceException;

public class DataUtils {

	private DataUtils() {
	}

	public static List<Account> getData()  {
		List<Account> list = new LinkedList<Account>();

		LocalDate validDob1 = Validation.getValidOpening("2020-10-10");
		LocalDate validDob2 = Validation.getValidOpening("2004-10-03");
		LocalDate validDob3 = Validation.getValidOpening("2020-09-10");
		LocalDate validDob4 = Validation.getValidOpening("2014-09-10");
		LocalDate validDob5 = Validation.getValidOpening("2014-01-10");
		LocalDate validDob6 = Validation.getValidOpening("2019-07-10");

		
		Double amount1 = Validation.miniBal(2000.0);
		Double amount2 = Validation.miniBal(10000.0);
		Double amount3 = Validation.miniBal(1000.0);
		Double amount4 = Validation.miniBal(50000.0);
		Double amount5 = Validation.miniBal(100000.0);
		Double amount6 = Validation.miniBal(3000.0);


		list.add(new Account("Vaibhav", validDob1, amount1));
		list.add(new Account("Sujata", validDob2, amount2));
		list.add(new Account("Prathmesh", validDob3, amount3));
		list.add(new Account("Rushikesh", validDob4, amount4));
		list.add(new Account("Vibhav", validDob5, amount5));
		list.add(new Account("Sanchit", validDob6, amount6));

		return list;
	}
}

