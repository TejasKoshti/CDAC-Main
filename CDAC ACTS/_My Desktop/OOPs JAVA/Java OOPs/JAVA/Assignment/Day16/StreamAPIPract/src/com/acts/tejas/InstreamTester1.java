package com.acts.tejas;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class InstreamTester1 {

	public static void main(String[] args) {
		
	OptionalDouble double1 = IntStream.rangeClosed(1, 100)
			.filter(i -> i % 2 != 0)
			.average();
	
	if (double1.isPresent()) {
		System.out.println("Avg = "+double1.getAsDouble());
		
	}else
	{
		System.out.println("no Avg");
	}
		
		
		
	}
}
