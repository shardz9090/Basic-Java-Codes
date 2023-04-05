package com.day5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	int amount = 50;
	
	public static void main(String[] args) {
//		new Main().sum(10);
		Main main = new Main();
		main.sum(10);
		
		//Using Map
		
		Map<String, String> student = new HashMap<String, String>();
		student.put("name", "hari");
		student.put("address", "ktm");
		student.put("contact", "98411111111");
		
//		for(String keys : student.keySet()) {
//			System.out.println(keys + " = "+ student.get(keys));
//		}
		
		//Storing List of Student
		List<Map<String, String>> studentList = new ArrayList<Map<String, String>>();
		studentList.add(student);
		
		Map<String, String> student1 = new HashMap<String, String>();
		student1.put("name", "shyam");
		student1.put("address", "bkt");
		student1.put("contact", "9840");
		studentList.add(student1);
		
		for(Map<String, String> std : studentList) {
			System.out.println("Name: "+std.get("name"));
			System.out.println("Address: "+std.get("address"));
			System.out.println("\n");
		}
		
		
		//Writing Code again......
		
	}
	
	public void sum(int amount) {
		int total = amount + amount;
		System.out.println(total);
		
		total = this.amount + amount;
		System.out.println(total);
		
		this.multiply(5);
		multiply(6);
	}
	
	public void multiply(int count) {
		System.out.println(this.amount * count);
	}
}
