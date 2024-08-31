package com.coding.exercise;
/**
 * Program: Reverse an Array with another Array
 * @author juhi
 */


public class ReverseArrayWithAnotherArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 0 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		ReverseArrayWithAnotherArray r = new ReverseArrayWithAnotherArray();
		arr = r.reverseArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public int[] reverseArray(int arr[]) {
		int arr2[] = new int[arr.length];
		for (int i = arr.length - 1, j = 0; i > 0; i--, j++) {
			arr2[j] = arr[i];
		}
		return arr2;
	}
}
