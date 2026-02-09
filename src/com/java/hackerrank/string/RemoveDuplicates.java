package com.java.hackerrank.string;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s1 = "aabbbccccddddd";
		String s2 = "say yes to no and yes to no and yes to no yes no";
		int[] n = {0, 6,9,1,0,3,7,4,0,1,2,8,5,3,9};
		
		removeDuplicates1(s1);
		removeDuplicates2(s2);
		removeDuplicates3(n);
		
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
	
	private static void removeDuplicates3(int[] n) {
		int [] n1=new int[n.length];
		int k=0;
		for(int i=0; i<n.length; i++) {
			boolean seen = false;
			for(int j=0; j<i; j++) {
				if(n[i]==n[j]) {
					seen=true;
					break;
				}
			}
			if(!seen) {
				n1[k++]=n[i];
			}
		}
		for(int i=0; i<k; i++) {
			System.out.print(n1[i]+" ");
		}
	}

}
