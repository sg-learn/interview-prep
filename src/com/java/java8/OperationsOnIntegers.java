package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OperationsOnIntegers {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12, 45, 76, 35, 35, 89, 15, 25, 12, 35);
		
		printDuplicates(list);
		printUniqueNumbers(list);

	}
	private static void printDuplicates(List<Integer> list) {
		System.out.println("printDuplicates------------------------");
		
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().filter(x -> (x.getValue()>1) ).
								forEach(x -> System.out.println(x.getKey()+": "+x.getValue()));
		
	}
	private static void printUniqueNumbers(List<Integer> list) {
		System.out.println("printUniqueNumbers------------------------");
		
	}

}
