package com.java.hackerrank.twopointer;

public class PairSumInSortedArray {

	public static void main(String[] args) {
		int[] a1 = {1,2,3,4,5,7};
		int[] a2 = {10,20,30,40,50,70,75,80,90,100,110};
		findPairSum(a1, 8);System.out.println();
		findPairSum(a2, 120);

	}

	private static void findPairSum(int[] a, int s) {
		int start=0, end=a.length-1;
		while (start<end) {
			int sum = a[start] + a[end];
			if(sum == s) {
				System.out.println("Is Pair for Sum "+s+": "+a[start]+","+a[end]);
			}
			if(sum < s) {
				start++;
			}
			else {
				end--;
			}
		}
	}

}
