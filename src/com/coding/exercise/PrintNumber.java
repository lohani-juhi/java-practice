package com.coding.exercise;
/**
 * Program: Print 1 to N
 * @author juhi
 */


import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PrintNumber p = new PrintNumber();
		p.printNumber(1, N);
	}

	public void printNumber(int num, int N) {
		for (int i = num; i <= N; i++) {
			System.out.println(i);
		}
	}

}
