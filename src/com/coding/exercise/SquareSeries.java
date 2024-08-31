package com.coding.exercise;
/**
 * Program: Print Square Series
 * @author juhi
 */


import java.util.Scanner;

public class SquareSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		SquareSeries ss = new SquareSeries();
		ss.printSquareSeries(a, b);
	}

	public void printSquareSeries(int a, int b) {
		for (int i = a; i <= b; i++) {
			System.out.println(i * i);
		}
	}

}
