package com.coding.exercise;
/**
 * Program: Absolute Value
 * @author juhi
 */


import java.util.Scanner;

public class AbsoluteValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		AbsoluteValue a = new AbsoluteValue();
		int abs = a.checkAbsoluteValue(num);
		System.out.println(abs);

	}

	public int checkAbsoluteValue(int num) {
		if (num < 0) {
			num = num * -1;
		}
		return num;

	}

}
