package com.coding.exercise;

/**
 * Program: Leap Year
 * @author juhi
 */


import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		LeapYear lp = new LeapYear();
		boolean isLeapYr = lp.isLeapYear(num);
		System.out.println("Year is " + (isLeapYr ? "LeapYear" : "Not a Leap Year"));
	}

	public boolean isLeapYear(int num) {
		return num % 4 == 0;

	}

}
