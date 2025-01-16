package com.cdac.acts.account.comparator;

import java.util.Comparator;

import com.cdac.acts.account.Account;

public class DateComparator implements Comparator<Account>  {
	
	@Override
	public int compare (Account a1, Account a2) {
		return a1.getOpening().compareTo(a2.getOpening());
	}
}
