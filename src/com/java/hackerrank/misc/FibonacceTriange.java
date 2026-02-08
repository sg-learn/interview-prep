package com.java.hackerrank.misc;

public class FibonacceTriange {

	public static void main(String[] args) {
		generateFibonacciTriangle(5);

	}

	private static void generateFibonacciTriangle(int n) {
		int a = -1, b = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
				if(i==j) {
					System.out.println();
				}
			}
		}
	}

}
