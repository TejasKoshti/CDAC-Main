package com.cdac.acts.comparator;

import java.util.Comparator;

import com.cdac.acts.fruits.Fruits;

public class PriceComparator implements Comparator<Fruits>  {
	@Override
	public int compare(Fruits a, Fruits b) {
		return a.getPrice().compareTo(b.getPrice());
	}
}
