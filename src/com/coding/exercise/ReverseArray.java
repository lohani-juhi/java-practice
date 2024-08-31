package com.coding.exercise;
/**
 * Program: Reverse an Array without using another array
 * @author juhi
 */


public class ReverseArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 0 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		ReverseArray r = new ReverseArray();
		arr = r.reverseArray(arr);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] +" ");
		}

	}

	public int[] reverseArray(int arr[]) {
		int n = arr.length;
		int num;
		for (int i = 0; i <= n / 2; i++) {
			num = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = num;
		}
		return arr;
	}

}
