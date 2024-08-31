package com.coding.exercise;
/**
 * Program: Count Vowels in a string 
 * @author juhi
 */


import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		CountVowels c = new CountVowels();
		int count = c.countVowels(str);
		System.out.println(count);

	}

	public int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

}
