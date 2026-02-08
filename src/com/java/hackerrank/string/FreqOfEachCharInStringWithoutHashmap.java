package com.java.hackerrank.string;

import java.util.Arrays;

public class FreqOfEachCharInStringWithoutHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFreqOfEachChar("ANAMIKA");
		printFreqOfEachChar("rAAABBBCCCDDDE");
	}

	private static void printFreqOfEachChar(String s) {

		char[] ch=s.toCharArray();
		Arrays.sort(ch);
		for(int i=0; i<ch.length; i++) {
			int c=0;
			for(int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j]) {
					c++;
				}
				else {
					continue;
				}
			}
			if(i==0 || (ch[i]!=ch[i-1])) {
				System.out.print(ch[i]+"-"+c+" ");
			}
		}
		System.out.println();
	}

}
