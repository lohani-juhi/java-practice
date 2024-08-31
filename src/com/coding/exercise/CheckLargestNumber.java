package com.coding.exercise;

/**
 * Program: Largest of 3 number
 * @author juhi
 */


import java.util.Scanner;

public class CheckLargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		CheckLargestNumber c = new CheckLargestNumber();
		int checkLargestNum = c.checkLargestNumber(num1, num2, num3);
		System.out.println("Largest number is :  " + checkLargestNum);
	}

	public int checkLargestNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3) {
			return num1;
		} 
		else if (num2 > num1 && num2 > num3) {
			return num2;
		} 
		else {
			return num3;
		}

	}

}
