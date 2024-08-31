package com.coding.exercise;

import java.util.Scanner;
/**
 * Program: Greatest Common Divisor
 * @author juhi
 */


public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		GCD g = new GCD();
		int gcd = g.getGCD(a, b);
		System.out.println(gcd);

	}

	public int getGCD(int a, int b) {
		int min = 0;
		int max = 0;
		if (a < b) {
			min = a;
			max = b;
		} 
		else {
			min = b;
			max = a;
		}

		for (int i = min; i >= 1; i--) {
			if (min % i == 0 && max % i == 0) {
				return i;
			}
		}
		return 1;

	}

}
