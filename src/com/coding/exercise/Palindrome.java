package com.coding.exercise;
/**
 * Program: Check string is Palindrome
 * @author juhi
 */


import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		Palindrome p = new Palindrome();
		boolean isPalindrome = p.isPalindrome(str);
		System.out.println("String is " + (isPalindrome ? "" : "Not a ") + "Palindrome");
	}

	public boolean isPalindrome(String str) {
		String rev = "";
		if (str != null) {
			for (int i = str.length() - 1; i >= 0; i--) {
				rev = rev + str.charAt(i);
			}
			return str.equals(rev);
		}
		return false;
	}

}
