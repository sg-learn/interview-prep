package com.java.hackerrank.string;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CompressedString {

	public static void main(String[] args) {
		String str = "aabbbccccddddde";
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();

		for (int i = 0; i < str.length(); i++) {
			String s = String.valueOf(str.charAt(i));
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.print(m.getKey()+m.getValue());
		}
	}
}
