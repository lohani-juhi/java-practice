package com.coding.exercise;
/**
 * Program: Reverse string
 * @author juhi
 */


import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ReverseString rev = new ReverseString();
		String reverse = rev.reverseString(str);
		System.out.println(reverse);
	}

	public String reverseString(String str) {
		if (str != null) {
			String rev = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			return rev;
		}
		return null;
	}

}
