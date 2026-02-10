package com.java.java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OperationsOnStrings {

	public static void main(String[] args) {
		String s = "Java is great. I love Java because Java is powerful";
		
		longestWordAndItsLength(s);
		secondLongestWord(s);
		frequencyOfEachWord(s);
		lengthOfEachWord(s);
		sortString(s);
		printDuplicateWords(s);

	}

	private static void longestWordAndItsLength(String s) {
		System.out.println("longestWordAndItsLength------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		String longestWord = list.stream().max(Comparator.comparingInt(String::length)).get();
		System.out.println(longestWord);
		
		long length = list.stream().map(String::length).max(Integer::compare).get();
		System.out.println(length);
		System.out.println();
	}
	
	private static void secondLongestWord(String s) {
		System.out.println("secondLongestWord------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		String secLongestWord=list.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(1).findFirst().get();
		System.out.println(secLongestWord);
		System.out.println();
	}
	
	private static void frequencyOfEachWord(String s) {
		System.out.println("frequencyOfEachWord------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.forEach((word, freq) -> System.out.println(word+":"+freq));
		System.out.println();
	}
	
	private static void lengthOfEachWord(String s) {
		System.out.println("lengthOfEachWord------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		list.stream().collect(Collectors.toMap(Function.identity(), String::length,
											(existing, replace) -> existing, LinkedHashMap::new))
		.forEach((word, len) ->System.out.println(word+": "+len));
		System.out.println();
	}
	
	private static void sortString(String s) {
		System.out.println("sortString------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		list.stream().sorted().distinct().forEach(x-> System.out.print(x+" "));
		System.out.println();System.out.println();
	}
	
	private static void printDuplicateWords(String s) {
		System.out.println("printDuplicateWords------------------------");
		List<String> list = Arrays.asList(s.split(" "));
		Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		map.entrySet().stream().filter(x -> x.getValue()>1).forEach(x -> System.out.println(x.getKey()));
		System.out.println();
	}

}
