package com.java.hackerrank.string;

public class PigLatinStyleWriting {

	public static void main(String[] args) {
		System.out.println(convertToPigLatin("Cheese"));
		System.out.println(convertToPigLatin("indira"));
		System.out.println(convertToPigLatin("sAnjay"));
		System.out.println(convertToPigLatin("KKK"));
	}

	private static String convertToPigLatin(String s) {
		String pigLatinWord;
		int firstVowelIndex = -1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (isVowel(s.charAt(i))) {
				firstVowelIndex = i;
				break;
			}
		}
		if (firstVowelIndex == -1) {
			pigLatinWord = s + "ay";
		} else {
			String remainingConsonantBeforeVowel = s.substring(0, firstVowelIndex);
			String remainingWordFromVowel = s.substring(firstVowelIndex);
			pigLatinWord = remainingWordFromVowel + remainingConsonantBeforeVowel + "ay";
		}
		return pigLatinWord;
	}

	private static boolean isVowel(char c) {
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
				|| c == 'U')
			return true;
		return false;
	}

}
