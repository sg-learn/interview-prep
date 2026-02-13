package com.java.java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OperationOnCharArray {

	public static void main(String[] args) {
		String s="aabbvvhhuekk";
		
		removeDuplicates(s);
		printDuplicates(s);
		printNonRepeatingCharacters(s);
		printFirstNonRepeatingCharacter(s);

	}

	private static void removeDuplicates(String s) {
		System.out.println("***************** removeDuplicates ***************** ");
		String stringWithoutDuplicates =
			s.chars().mapToObj(c->(char)c).distinct().map(String::valueOf).collect(Collectors.joining());
		System.out.println(stringWithoutDuplicates);
		System.out.println();
	}

	private static void printDuplicates(String s) {
		System.out.println("***************** printDuplicates ***************** ");
		Map<Character, Long> map = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(
				Function.identity(), Collectors.counting()	));
		map.entrySet().stream().filter(c -> (c.getValue()>1)).forEach(c -> System.out.print(c.getKey()));
		System.out.println();
	}
	
	private static void printNonRepeatingCharacters(String s) {
		System.out.println("***************** printNonRepeatingCharacters ***************** ");
		s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(c -> (c.getValue()==1))
			.forEach(System.out::println);
		System.out.println();
	}
	
	private static void printFirstNonRepeatingCharacter(String s) {
		System.out.println("***************** printFirstNonRepeatingCharacters ***************** ");
		char cc = s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		.entrySet().stream().filter(c -> (c.getValue()==1)).findFirst().get().getKey();
		System.out.println(String.valueOf(cc));
		System.out.println();
	}

}
