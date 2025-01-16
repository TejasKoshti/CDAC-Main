package com.acts.tejas;

import java.util.stream.IntStream;

public class InstreamTester {

	public static void main(String[] args) {

		
		IntStream.range(500, 1000)
		.filter( i -> i % 2 != 0)
		.forEach(System.out::println);
		
	}
}
