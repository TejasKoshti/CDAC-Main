package com.acts.tejas;

import java.util.Arrays;

public class ArrayStreamTester {
	public static void main(String[] args) {
		
		System.out.println("Sorted int asc");
		Arrays.asList(10,20,30,40,50,60,50,450,250,250,520,50,50,50,50,5,0,540,542)
		.stream()
		.sorted()
		.forEach( i -> System.out.println(i+" "));
		
		System.out.println("Sorted int des");
		Arrays.asList(10,20,30,40,50,60,50,450,250,250,520,50,50,50,50,5,0,540,542)
		.stream()
		.sorted((i1,i2) -> i2.compareTo(i1))
		.forEach(System.out::println);
		
		
	}

}
