package com.cdac.acts.fruits.data_entry;

import java.util.ArrayList;
import java.util.List;

import com.cdac.acts.fruits.Fruits;

public class DataEntry {
	
	private DataEntry() {}
	
	public static List<Fruits> getData() {
		List<Fruits> list = new ArrayList<>();
		list.add(new Fruits("bannana", "yellow", 12, 5));
		list.add(new Fruits("apple", "red", 10, 10));
		list.add(new Fruits("mango", "orange", 10, 20));
		list.add(new Fruits("kiwi", "brown", 6, 30));
		list.add(new Fruits("watermelon", "green", 5, 100));
		list.add(new Fruits("guava ", "green", 13, 8));
		return list;
	}
}
