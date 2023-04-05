package com.khec.day2;

public class Employee {

	public static String name = "Hello";
	int amount = 2000;
	
	public void add() {
		System.out.println("I am Employee add");
	}
	
	public void multiply(int a, int b) {
		int sum = a * b;
		System.out.println("Multiple: "+sum);
	}
}
