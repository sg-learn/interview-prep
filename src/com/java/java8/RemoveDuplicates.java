package com.java.java8;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1 = "aabbbccccddddd";
		String s2 = "say yes to no and yes to no and yes to no yes no";
		
		removeDuplicates1(s1);
		removeDuplicates2(s2);
		
	}

	private static void removeDuplicates1(String s1) {
		StringBuilder sb = new StringBuilder();
		boolean [] seen = new boolean[256];
		for(int i=0; i<s1.length(); i++) {
			char ch=s1.charAt(i);
			if(!seen[ch]) {
				sb.append(ch);
				seen[ch]=true;
			}
		}
		System.out.println(sb.toString());
	}

	private static void removeDuplicates2(String s2) {
		StringBuilder sb = new StringBuilder();
		
		String[] words = s2.split(" ");
		for(int i=0; i<words.length; i++) {
			boolean seen = false;
			for(int j=0; j<i; j++) {
				if(words[i].equals(words[j])) {
					seen = true;
					break;
				}
			}
			if(!seen) {
				sb.append(words[i]+" ");
			}
		}
		System.out.println(sb.toString());
	}

}
