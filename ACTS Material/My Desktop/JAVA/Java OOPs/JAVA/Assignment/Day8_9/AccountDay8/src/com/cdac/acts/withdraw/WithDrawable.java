package com.cdac.acts.withdraw;

import com.cdac.acts.minimum_balance_Exception.MinimumBalanceException;

@FunctionalInterface
public interface WithDrawable {
	public double withdraw(double amount) throws MinimumBalanceException;
}
