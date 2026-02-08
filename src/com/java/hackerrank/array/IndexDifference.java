package com.java.hackerrank.array;

public class IndexDifference {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 5, 8, 4, 2 };
		findIndexDifference(a);

	}

	private static void findIndexDifference(int[] a) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 1; i <= a.length - 2; i++) {
			if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
				min = Math.min(min, i);
				max = Math.max(max, i);
			}
		}
		System.out.println(max - min);
	}

}
