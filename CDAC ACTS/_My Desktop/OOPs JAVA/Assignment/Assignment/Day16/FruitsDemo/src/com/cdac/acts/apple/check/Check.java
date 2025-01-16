package com.cdac.acts.apple.check;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.LinkedList;

import com.cdac.acts.apple.Apple;

public class Check {
	private Check() {
	}

	public static List<Apple> check(List<Apple> appleList, Predicate<Apple> predicate) {

		List<Apple> temp = appleList.stream()
		.filter(predicate)
		.collect(Collectors.toList());
		
		return temp;
	}

}
