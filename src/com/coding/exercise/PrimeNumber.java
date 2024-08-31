package com.coding.exercise;
/**
 * Program: Prime Number
 * @author juhi
 */


import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		PrimeNumber p = new PrimeNumber();
		boolean isPrime = p.isPrime(num);
		System.out.println( "Number is " + (isPrime ?  "prime" : "not a prime"));

	}

	public boolean isPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
