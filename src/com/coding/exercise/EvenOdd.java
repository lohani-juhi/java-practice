package com.coding.exercise;
/**
 * Program:Check number is even or odd
 * @author juhi
 */

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		EvenOdd eo = new EvenOdd();
		boolean isEven = eo.isEven(num);
		System.out.println( "Number is " + (isEven ?  "even" : "odd"));
	}

	public boolean isEven(int num) {
		return num % 2 == 0;

	}
}
