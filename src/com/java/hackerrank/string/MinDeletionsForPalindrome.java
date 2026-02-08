package com.java.hackerrank.string;

import java.util.HashMap;
import java.util.Map;

public class MinDeletionsForPalindrome {

	public static void main(String[] args) {
		minDeletions("abcedda");
		minDeletions("aada");
		minDeletions("aaaabcdeefre");
		minDeletions("ss1");
	}
	
	public static void minDeletions(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c=s.toCharArray();
        int oddCount=0, minDel=0;
        for(int i=0; i< c.length; i++) {
        	map.put(c[i], map.getOrDefault(c[i],0)+1);
        }
        for(Map.Entry<Character, Integer> m: map.entrySet()) {
        	if(m.getValue()%2!=0) {
        		oddCount++;
        	}
        }
        minDel=oddCount>0? oddCount-1: 0;
        System.out.println("Minimum deletions: " + minDel);
    }

}
