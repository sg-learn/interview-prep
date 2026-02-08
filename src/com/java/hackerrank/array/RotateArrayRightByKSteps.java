package com.java.hackerrank.array;

public class RotateArrayRightByKSteps {

	public static void main(String[] args) {
		// slicing technique
		int [] a= {1,2,3,4,5};
		rotateArrayRight(a, 2);
		rotateArrayRight(a, 3);
	}

	private static void rotateArrayRight(int[] a, int k) {
		int arrLen=a.length, bi=0;
		int[]b=new int[arrLen];
		for (int i=0; i<arrLen; i++) {
			if((i+k) < arrLen) {
				b[bi]=a[i+k];
			} else {
				b[bi]=a[(i+k)-arrLen];
			}
			bi++;
		}
		for (int i=0; i<arrLen; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}

}
