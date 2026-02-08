package com.java.hackerrank.array;

public class MoveZeroToEnd {

	public static void main(String[] args) {
		int[] a= {0,1,0,3,12};
		int newIndex=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[newIndex]=a[i];
				newIndex++;
			}
		}
		while(newIndex<a.length) {
			a[newIndex]=0;
			newIndex++;
		}
		for(int k=0; k<a.length; k++) {
			System.out.println(a[k]);
		}
	}

}
