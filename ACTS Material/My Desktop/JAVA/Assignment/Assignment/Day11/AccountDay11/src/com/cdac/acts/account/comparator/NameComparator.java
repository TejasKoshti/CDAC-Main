package com.cdac.acts.account.comparator;

import java.util.Comparator;

import com.cdac.acts.account.Account;


public class NameComparator implements Comparator<Account> {
	@Override
	public int compare(Account a, Account b) {
		return a.getName().compareTo(b.getName());
	}
}
