package com.java.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestWordAndItsLength {

	public static void main(String[] args) {
		String word = "Have faith in Godssssssssssss";
		List<String> wordList = Arrays.asList(word.split(" "));
		
		String longestWord = wordList.stream().max(Comparator.comparingInt(String::length)).get(); 
		System.out.println(longestWord);
		
		int maxLength = wordList.stream().map(String::length).max(Integer::compare).get();
		System.out.println(maxLength);
	}

}
