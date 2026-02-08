package com.java.hackerrank.string;

public class DecompressedString {

	public static void main(String[] args) {
		String inputStr = "a1b2c3d4e";
        displayCompressedString(inputStr);
	}

	private static void displayCompressedString(String inputStr) {
		int rep=0, i=0; String str = "";
		inputStr=inputStr+" ";
		
		while(inputStr.charAt(i)!=' ') {
			if(inputStr.charAt(i) == ' ') {
				//str = str+inputStr.charAt(i);
				break;
			}
			//if(Character.isDigit(inputStr.charAt(i+1))) {
			if(inputStr.charAt(i+1)>=48 && inputStr.charAt(i+1)<=57) {
				rep = inputStr.charAt(i+1)-'0';
				str = str+repeatedString(inputStr.charAt(i), rep);
				i=i+2;
			} else {
				str = str+inputStr.charAt(i);
				i++;
			}
		}
		System.out.println(str);
	}

	private static String repeatedString(char ch, int rep) {
		String repStr="";
		for (int i=0; i<rep;i++) {
			repStr=repStr+String.valueOf(ch);
		}
		return repStr;
	}

}
