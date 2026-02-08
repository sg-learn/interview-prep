package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EvenNumInAList {

	public static void main(String[] args) {
		int[] n= {5,8,1,2,6,9,0,4};
		printOddNumbers(n);
		
		int[] m= {25,68,71,92,66,99,30,74};
		printNumStartingWith6(m);
	}

	private static void printOddNumbers(int[] n) {
		List<Integer> lo=Arrays.stream(n).boxed().collect(Collectors.toList());
		lo.stream().filter(x -> x%2!=0).forEach(System.out::println);
		
		Integer k=lo.stream().filter(x -> x%2!=0).findFirst().get();
		System.out.println("FindFirst: "+k);
		
		List<Integer> listOfOddNum=lo.stream().filter(x -> x%2!=0).collect(Collectors.toList());
		System.out.println(listOfOddNum);
	}

	private static void printNumStartingWith6(int[] m) {
		Arrays.stream(m).mapToObj(String::valueOf).filter(x -> x.endsWith("6")).forEach(System.out::println);System.out.println();
		Arrays.stream(m).mapToObj(String::valueOf).filter(x -> x.startsWith("6")).forEach(System.out::println);System.out.println();
		Arrays.stream(m).filter(x -> String.valueOf(x).startsWith("6")).forEach(System.out::println);System.out.println();
		Arrays.stream(m).filter(x -> x%2==0).forEach(System.out::println);
	}

}
