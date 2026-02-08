package com.java.hackerrank.array;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a1 = {3,0,2,1};
		int [] a2 = {0,1};
		int [] a3 = {9,6,4,2,3,5,7,0,1};
		missingNumber(a1);
		missingNumber(a2);
		missingNumber(a3);
	}

	public static void missingNumber(int[] a) {
		int n = a.length;
        int result = n;
        for (int i = 0; i < n; i++) {
            result = result ^ (i ^ a[i]);
        }
        System.out.println(result);
        System.out.println("-----------");
    }

}
