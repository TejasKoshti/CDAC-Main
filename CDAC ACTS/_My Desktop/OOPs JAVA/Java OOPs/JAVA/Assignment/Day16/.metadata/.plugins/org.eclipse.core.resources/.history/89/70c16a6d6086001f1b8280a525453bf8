package com.acts.tejas;

import java.util.Arrays;

public class ArryStremTester2 {

	
	public static void main(String[] args) {
		
		
		int[] data = {31,45,5,2,5,4,5,45,12};
		System.out.println("Int[]");
		Arrays.stream(data).sorted()
		.forEach( i -> System.out.println(i));
		
		System.out.println("int[] --> Instream --> forEach : meth ref ");
		Arrays.stream(data).forEach(System.out::println);
		
		System.out.println("printing ints using parallel stream");
		
		Integer[] data2 = {34,12,45,78,56,4,5};
		Arrays.asList(data2)
		.parallelStream().forEach(System.out::println);
		
	}
	
}
