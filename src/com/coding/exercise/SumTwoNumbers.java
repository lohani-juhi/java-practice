package com.coding.exercise;
/**
 * Program:Take 2 Number and print sum
 * @author juhi
 */

import java.util.Scanner;

public class SumTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		SumTwoNumbers s = new SumTwoNumbers();
		int sum = s.sum(num1, num2);
		System.out.println("Sum of " + num1 + " & " + num2 + " is : " + sum);
	}

	public int sum(int num1, int num2) {
		return num1 + num2;

	}

}
