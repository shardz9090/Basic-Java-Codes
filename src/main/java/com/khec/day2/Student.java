package com.khec.day2;

public class Student extends Employee{

	public void add() {
		System.out.println("I am Student add");
		super.add();
	}
	
	public void add(int a, int b) {
		int sum = a+b;
		System.out.println("Sum: "+sum);
	}
	
	public void add(String a, int b) {
	}
}