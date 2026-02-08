package com.java.hackerrank.twopointer;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingChar {

	public static void main(String[] args) {
		longestUnique("pwwkew");
		longestUniqueWithTwoPointerSlidingWindow("supwwkew");

	}

	private static void longestUnique(String s) {
		StringBuilder b=new StringBuilder();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length() - 1; i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		for(Map.Entry<Character, Integer> m: map.entrySet()) {
			b.append(m.getKey());
		}
		System.out.println(b);
	}
	
	private static void longestUniqueWithTwoPointerSlidingWindow(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        System.out.println(maxLen);
	}

}
