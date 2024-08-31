package com.coding.exercise;
/**
 * Program: Take userName and Print Hello "User"!
 * @author juhi
 */
import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		HelloUser hu = new HelloUser();
		hu.helloUser(name);		
	}
	public void helloUser(String name) {
		System.out.println("Hello " + name + "!");
	}
}
