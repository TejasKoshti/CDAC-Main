package com.acts.tejas;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;


public class StreamTester {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Ganesh","Dinesh","Ramesh","Suresh"));
		
//		Stream<String> stream = list.stream();
//		stream = stream.map((s) -> s.toLowerCase());
//		List<String> proccesList = stream.collect(Collectors.toList());
//		System.out.println(proccesList);
//		
//		
//		proccesList.forEach(System.out::println);
		
		List<String> newList =list.stream()
				.map(s ->s.toUpperCase())
				.collect(Collectors.toList());
				newList.forEach(System.out::println);
				
		
	}
}
