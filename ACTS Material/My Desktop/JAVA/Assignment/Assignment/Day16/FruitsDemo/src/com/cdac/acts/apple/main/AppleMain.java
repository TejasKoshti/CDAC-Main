package com.cdac.acts.apple.main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.cdac.acts.apple.data_utils.DataUtils;
import com.cdac.acts.apple.Apple;
import com.cdac.acts.apple.check.Check;

public class AppleMain {

	public static void main(String[] args) {

		List<Apple> list = DataUtils.getData();

		System.out.println("Filter By Weight");
		list.stream().filter(a -> a.getWeight().equals(200)).forEach(System.out::println);

		System.out.println();

		System.out.println("Filter By Color");
		List<Apple> list1 = list.stream().filter(a -> a.getColor().equals("Black")).collect(Collectors.toList());
		list1.forEach(a -> System.out.println(a));

		System.out.println();

		System.out.println("Filter By Color, and Weight");
		list.stream().filter((a) -> (a.getColor().equals("Red") && a.getWeight().equals(100)))
				.forEach(a -> System.out.println(a));

		System.out.println();

		System.out.println("Filter By Color, Weight, and Taste");
		list.stream().filter(
				(a) -> (a.getColor().equals("Green") && a.getWeight().equals(50) && a.getTaste().equals("No Taste")))
				.forEach(System.out::println);

		System.out.println();

		System.out.println("Sort by Weight");
		list.stream().sorted((a1, a2) -> a1.getWeight().compareTo(a2.getWeight())).forEach(System.out::println);
		
		System.out.println();

		System.out.println("Sort by color");
		list.stream().sorted((a1, a2) -> a1.getColor().compareTo(a2.getColor())).forEach(System.out::println);
		
		System.out.println();

		System.out.println("Remove red apples");
		list.stream().filter((a) -> !"red".equalsIgnoreCase(a.getColor()))
		.map((a) -> a.toString())
		.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("Remove red apples");
		list.stream().filter((a) -> !(a.getColor().equals("Green")))
		.map((a) -> a.toString())
		.forEach(System.out::println);
		
		System.out.println();
		
		Set<Apple> set = list.stream()
		.map(a -> a)
		.collect(Collectors.toSet());
		
		set.forEach(System.out::println);
		
		System.out.println("*****************************************************");
		
		System.out.println(Check.check(list, a -> a.getWeight().equals(100)));
		
		System.out.println(Check.check(list, a -> a.getColor().equals("Red")));
		
		System.out.println(Check.check(list, a -> a.getTaste().equals("Sweet")));

	}
}
