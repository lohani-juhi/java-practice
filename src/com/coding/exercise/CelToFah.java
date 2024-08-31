package com.coding.exercise;
/**
 * Program: Convert temperature from celcius to fahrenheit
 * @author juhi
 */

import java.util.Scanner;

public class CelToFah {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float c = sc.nextFloat();
		CelToFah cf = new CelToFah();
		float fah= cf.CelFah(c);
		System.out.println(fah);

	}

	public float CelFah(float c) {
		float f = (float) (c * (9.0 / 5.0) + 32);
		return f;
	}

}
