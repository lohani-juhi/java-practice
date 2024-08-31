package com.coding.exercise;
/**
 * Program: Check length of string
 * @author juhi
 */
import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		if (str != null) {
			System.out.println("Length of \""+ str + "\" is "+ str.length());
		}

	}

}
