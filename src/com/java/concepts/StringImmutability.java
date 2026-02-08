package com.java.concepts;

public class StringImmutability {

	public static void main(String[] args) {
		testStringImmutability();

	}
	
	private static void testStringImmutability() {
		String s1="Java";
		String s2="Java";
		s1.toUpperCase();
		System.out.println(System.identityHashCode(s1)+"-"+s1);
		System.out.println(System.identityHashCode(s2)+"-"+s2);
		System.out.println(System.identityHashCode(s1.toUpperCase())+"-"+s1.toUpperCase());
		System.out.println(System.identityHashCode(s2.toUpperCase())+"-"+s2.toUpperCase());
	}

}
