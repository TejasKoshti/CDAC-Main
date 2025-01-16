package com.cdac.acts.account.comparator;

import java.util.Comparator;

import com.cdac.acts.accounta.Account;

public class DateComparator implements Comparator<Account>{

	public int compare(Account a, Account b) {
	
	return a.getOpening().compareTo(b.getOpening()); 
	}
			
}
