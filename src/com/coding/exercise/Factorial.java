package com.coding.exercise;
/**
 * Program: Calculate Factorial of N
 * @author juhi
 */


import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Factorial f = new Factorial();
		int fact = f.calcFact(N);
		System.out.print(fact);
	}

	public int calcFact(int N) {
		int fact = 1;
		for (int i = N; i > 1; i--) {
			fact = fact * i;
		}
		return fact;
	}

}
