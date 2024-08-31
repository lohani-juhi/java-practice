package com.coding.exercise;
/**
 * Program:Calculate the area of Triangle
 * @author juhi
 */

import java.util.Scanner;

public class AreaOfTri {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float b = sc.nextFloat();
		float h = sc.nextFloat();
		AreaOfTri a = new AreaOfTri();
		float area = a.calAreaOfTri(b, h);
		System.out.println(area);
	}

	public float calAreaOfTri(float b, float h) {
		float A = (float) (1.0 / 2.0 * b * h);
		return A;
	}

}
