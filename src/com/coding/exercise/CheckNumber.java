package com.coding.exercise;
/**
 * Program: Check number is zero, positive, negative.
 * @author juhi
 */


import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		CheckNumber c = new CheckNumber();
		String checkNum = c.checkNumber(num);
		System.out.println("Number is " + checkNum );

	}

	public String checkNumber(int num) {
		if (num == 0) {
			return "zero";
		}
		else if (num > 0) {
			return "postive";
		} 
		else {
			return "negative";
		}
	}
}
