package com.cdca.acts.string_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringMain {

	public static void main(String[] args) {

		String[] listArr = { "RedApple", "Mango", "Apple", "GreenApple", "Apple", "Mango", "Grapes" };
		List<String> list = new ArrayList<String>(Arrays.asList(listArr));

		System.out.println("Print Distinct String in List ");
		list.stream().distinct().forEach(System.out::println);

		System.out.println();

		System.out.println("Print all with UPPERCASE");
		list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);

		System.out.println();

		System.out.println("Print which starts with Specific Letter");
		list.stream().filter(a -> a.startsWith("G") || a.startsWith("M")).forEach(System.out::println);

		System.out.println();

		System.out.println("1 -> Concat All Strings in the List");
		String temp = list.stream()
		.reduce("", (a, b) -> a + (a.isEmpty() ? "" : " ") + b);
		System.out.println(temp);
		
		System.out.println();
		
		System.out.println("2 -> Concat All Strings in the List");
		String tempList = list.stream().collect(Collectors.joining(" "));
		System.out.println(tempList);

		System.out.println();

		System.out.println("Filter by ending with 'ple' text");
		list.stream().filter(a -> a.endsWith("ple")).forEach(System.out::println);
	}

}
