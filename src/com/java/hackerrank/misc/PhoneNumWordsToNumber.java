package com.java.hackerrank.misc;

import java.util.HashMap;

public class PhoneNumWordsToNumber {
	private static HashMap<String, String> wordDigitPair = new HashMap<String, String>();

	public static void main(String[] args) {
		wordDigitPair.put("zero", "0");
		wordDigitPair.put("one", "1");
		wordDigitPair.put("two", "2");
		wordDigitPair.put("three", "3");
		wordDigitPair.put("four", "4");
		wordDigitPair.put("five", "5");
		wordDigitPair.put("six", "6");
		wordDigitPair.put("seven", "7");
		wordDigitPair.put("eight", "8");
		wordDigitPair.put("nine", "9");

		String phoneNumberInWords = "double nine four eight double two five triple six";
		System.out.println(getPhoneNumInDigitsMethod1(phoneNumberInWords.toLowerCase()));
		System.out.println(getPhoneNumInDigitsMethod2(phoneNumberInWords.toLowerCase()));
	}
	
	private static long getPhoneNumInDigitsMethod1(String phoneNumberInWords) {
		long start = System.currentTimeMillis();
		int i = 0, rep=0;
		StringBuilder phoneNumberInDigits = new StringBuilder();
		String digit="";
		phoneNumberInWords = phoneNumberInWords + " eof";
		String[] phoneNumInWordsArray = phoneNumberInWords.split(" ");
		
		while (!phoneNumInWordsArray[i].equalsIgnoreCase("eof")) {
			if(phoneNumInWordsArray[i].equalsIgnoreCase("eof")) {
				break;
			}
			if(phoneNumInWordsArray[i].equalsIgnoreCase("double") || phoneNumInWordsArray[i].equalsIgnoreCase("triple")) {
				if(phoneNumInWordsArray[i].equalsIgnoreCase("double")) {
					rep=2;
				}
				if(phoneNumInWordsArray[i].equalsIgnoreCase("triple")) {
					rep=3;
				}
				i=i+1;
				digit = getDigitForWord(phoneNumInWordsArray[i]);
				String repeatedNum = appendDigits(phoneNumInWordsArray[i], rep, digit);
				phoneNumberInDigits.append(repeatedNum);
			}
			else {
				digit = getDigitForWord(phoneNumInWordsArray[i]);
				phoneNumberInDigits = phoneNumberInDigits.append(digit);
			}
			i++;
		}
		System.out.println("Method 1: "+(System.currentTimeMillis()-start));
		return (Long.parseLong(phoneNumberInDigits.toString()));
	}

	private static String appendDigits(String phoneNumberInDigits, int rep, String digit) {
		String repeatedNum = "";
		for (int i=0; i<rep; i++) {
			repeatedNum=repeatedNum+digit;
		}
		return repeatedNum;
	}

	private static long getPhoneNumInDigitsMethod2(String phoneNumberInWords) {
		long start = System.currentTimeMillis();
		int i = 0;
		String n="";
		phoneNumberInWords = phoneNumberInWords + " eof";
		String[] phoneNumInWordsArray = phoneNumberInWords.split(" ");
		
		while (!phoneNumInWordsArray[i].equalsIgnoreCase("eof")) {
			if(phoneNumInWordsArray[i].equalsIgnoreCase("eof")) {
				break;
			}
			if(phoneNumInWordsArray[i].equalsIgnoreCase("double") || phoneNumInWordsArray[i].equalsIgnoreCase("triple")) {
				String key = phoneNumInWordsArray[i+1];
				if(phoneNumInWordsArray[i].equalsIgnoreCase("double")) {
					n=n+wordDigitPair.get(key)+wordDigitPair.get(key);
				}
				if(phoneNumInWordsArray[i].equalsIgnoreCase("triple")) {
					n=n+wordDigitPair.get(key)+wordDigitPair.get(key)+wordDigitPair.get(key);
				}
				i=i+2;
			}
			else {
				n=n+getDigitForWord(phoneNumInWordsArray[i]);
				i++;
			}
		}
		System.out.println("Method 2: "+(System.currentTimeMillis()-start));
		return (Long.parseLong(n));
	}

	private static String getDigitForWord(String word) {
		String digit = wordDigitPair.get(word);
		return digit;
	}

}
