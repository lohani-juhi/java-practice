package com.coding.exercise;
/**
 * Program: Maximum of Array
 * @author juhi
 */


public class MaxOfArray {

	public static void main(String[] args) {
		int arr[] = { 2, 4, 6, 8, 10 };
		MaxOfArray max = new MaxOfArray();
		int maxVal = max.maxOfArray(arr);
		System.out.println(maxVal);
	}

	public int maxOfArray(int arr[]) {
		int maxVal = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > maxVal) {
				maxVal = arr[i];
			}
		}
		return maxVal;

	}
}
