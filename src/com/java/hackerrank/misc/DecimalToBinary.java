package com.java.hackerrank.misc;

public class DecimalToBinary {

	public static void main(String[] args) {
		convertDecimalToBinary(2);
		convertDecimalToBinary(4);
		convertDecimalToBinary(5);
		convertDecimalToBinary(7);
		convertDecimalToBinary(13);
		convertDecimalToBinary(134);
	}

	private static void convertDecimalToBinary(int n) {
		int r=1;
		StringBuilder b = new StringBuilder();
		for (int i=n; i>0; i=i/2) {
			r = i%2;
			b.append(r);
		}
		System.out.println(n +"->"+ b.reverse());
	}

}
