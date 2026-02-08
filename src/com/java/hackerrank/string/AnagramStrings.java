package com.java.hackerrank.string;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		isAnagram("race", "acer");
		isAnagram("list", "tiles");
		isAnagram("fox", "fxl");
		isAnagram("pets", "step");
	}

	private static void isAnagram(String s1, String s2) {

		if(s1.length()!=s2.length()) {
			System.out.println("Strings are of different length");
			return;
		}
		else {
			char [] c1 = s1.toCharArray();
			char [] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2)) {
				System.out.println(s1+" and "+s2+" : ANAGRAM");
			} else {
				System.out.println(s1+" and "+s2+" : NOT ANAGRAM");
			}
		}
		
	}

}
