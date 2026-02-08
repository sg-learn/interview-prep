package com.java.hackerrank.twopointer;

public class PallindromeUsing2Pointer {

	public static void main(String[] args) {
		
		isPallindrome("abba");
		isPallindrome("racecar");
		isPallindrome("wer");
	}

	private static void isPallindrome(String s) {
		char[] c=s.toCharArray(); boolean flag=true;
		int start=0, end=s.length()-1;
		while (start<=end) {
			if(c[start]==c[end]) {
				start++;
				end--;
			} else {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("PALLINDROME");
		}
		else {
			System.out.println("NOT PALLINDROME");
		}
	}

}
