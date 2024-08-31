package com.coding.exercise;
/**
 * Program:Swap two numbers with third variable
 * @author juhi
 */

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		Swapping s = new Swapping();
		s.swap(a, b);
	}

	public void swap(int a, int b) {
		System.out.println("Before : " + "a is : " + a + " b is : " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After : " + "a is : " + a + " b is : " + b);
	}

}
