package com.coding.exercise;

/**
 * Program: Sort an array
 * @author juhi
 */


public class Sorting {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 5, 0 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Sorting s = new Sorting();
		arr = s.arraySort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public int[] arraySort(int arr[]) {
		int num;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j <= arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}

		return arr;
	}

}
