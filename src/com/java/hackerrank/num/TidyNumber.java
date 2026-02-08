package com.java.hackerrank.num;

public class TidyNumber {

	public static void main(String[] args) {
		
		isTidy(12345);
		isTidy(1224);
		isTidy(1254);
		isTidy(92345);
	}

	private static void isTidy(int n) {
		Integer max=Integer.MIN_VALUE;int r=0;
		while(n>0) {
			if(n%10 < max) {
				System.out.println("not tidy");
			}
			else {
				r=n/10;
			}
		}
	}

}
