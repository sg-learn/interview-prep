package com.java.hackerrank.num;

public class HCF {

	public static void main(String[] args) {

		findHCF(48, 18);
		findHCF(1071, 462);
		findHCF(1987654320, 543210);

	}

	private static void findHCF(int n1, int n2) {
		int a=0, b=0, rem=0;
		if(n1>n2) {
			a = n1;
			b = n2;
		} else {
			a = n2;
			b = n1;
		}
		while (a % b != 0) {
			rem = a % b;
			a = b;
			b = rem;
		}
		System.out.println(b);
	}

}
