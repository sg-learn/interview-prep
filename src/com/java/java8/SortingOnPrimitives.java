package com.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingOnPrimitives {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(3,6,2,19,36);
		num.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("---------------------------------------------------------------");
		num.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x));
		System.out.println("---------------------------------------------------------------");
		
		List<String> str = Arrays.asList("Shweta","Anant","Himanshu","Anurag","Peeyush");
		str.stream().sorted().forEach(x -> System.out.println(x));
		System.out.println("---------------------------------------------------------------");
		str.stream().sorted(Collections.reverseOrder()).forEach(x -> System.out.println(x));
		System.out.println("---------------------------------------------------------------");
		
		str.stream().sorted( (n1, n2) -> n2.compareTo(n1) ).forEach(System.out::println);
	}
}
