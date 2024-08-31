package com.coding.exercise;
/**
 * Program: Calculate Perimete of a rectangle
 * @author juhi
 */


import java.util.Scanner;

public class PerimeterOfRect {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float l = sc.nextFloat();
		float b = sc.nextFloat();
		PerimeterOfRect p = new PerimeterOfRect();
		float perimeter = p.calcPeriOfRect(l, b);
		System.out.println(perimeter);
	}

	public float calcPeriOfRect(float l, float b) {
		float P = (float) ((l + b) * 2.0);
		return P;

	}

}
