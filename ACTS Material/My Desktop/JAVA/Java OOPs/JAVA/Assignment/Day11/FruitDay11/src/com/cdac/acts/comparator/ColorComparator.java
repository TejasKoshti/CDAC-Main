package com.cdac.acts.comparator;

import java.util.Comparator;

import com.cdac.acts.fruits.Fruits;

public class ColorComparator implements Comparator<Fruits> {
	
	@Override
	public int compare(Fruits a, Fruits b) {
		return a.getColor().compareTo(b.getColor());
	}
}
