package com.cdac.acts.apple.data;

import java.util.List;
import java.util.LinkedList;

import com.cdac.acts.apple.Apple;

public class Data_Utils {
	private Data_Utils() {
	}

	public static List<Apple> getData() {
		List<Apple> list = new LinkedList<Apple>();
		list.add(new Apple(100, "Red", "Sweet"));
		list.add(new Apple(100, "Red", "Sweet"));
		list.add(new Apple(100, "Red", "Sweet"));
		list.add(new Apple(100, "Red", "Sweet"));
		list.add(new Apple(200, "Green", "Sour"));
		list.add(new Apple(300, "Red", "Sweet"));
		list.add(new Apple(50, "Green", "Sour"));
		list.add(new Apple(70, "Red", "Sweet"));
		list.add(new Apple(200, "Black", "Sweet"));
		list.add(new Apple(80, "Red", "Sweet"));
		list.add(new Apple(300, "Black", "Sour"));
		list.add(new Apple(100, "Red", "No Taste"));
		list.add(new Apple(50, "Green", "No Taste"));
		list.add(new Apple(70, "Red", "Sweet"));
		list.add(new Apple(80, "Black", "No Taste"));
		return list;
	}
}
