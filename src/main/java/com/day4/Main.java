package com.day4;

public class Main {

	public static void main(String[] args) {
		
		String name = "Khwopa";
		name = name.toUpperCase();
		System.out.println(name);
		name = name.toLowerCase();
		System.out.println(name);
		
		if(name == "khwopa") {
			System.out.println("pass ==");
		}
		
		if(name.equals("khwopa")) {
			System.out.println("pass equals");
		}
		
		if(name.equalsIgnoreCase("KHwopa")) {
			System.out.println("pass equalsIgnoreCase");
		}
		
		if(name.toLowerCase().equals("KHwopa".toLowerCase())) {
			System.out.println("Lower case equals pass");
		}
		
		char[] test = name.toCharArray();
		for(char c : test) {
			System.out.println(c);
		}
		
		name = name +"-Engineering-Collegeo";
		System.out.println(name);
		String[] names = name.split("-");
		for(String n : names) {
			System.out.println(n);
		}
		
		name = name.replace("e", "11");
		System.out.println(name);
		
		
		System.out.println(name.length());
		
		int pos = name.indexOf("o");
		int pos_last = name.lastIndexOf("o");
		
		System.out.println("pos: "+pos);
		System.out.println(pos_last);
		
		name = "Hello World!!";
		System.out.println(name);
		int val = name.compareTo("hell");
		System.out.println(val);
		
		
		boolean status = name.contains("rl");
		if(status) {
			System.out.println("pass");
		} else
			System.out.println("fail");
		
		
		status = name.startsWith("H");
		System.out.println(status);
		
		status = name.startsWith("He");
		System.out.println(status);
		
		status = name.startsWith("HEL");
		System.out.println(status);
		
		String test1 = "name";
		String[] ll = test1.split(",");
		
		String[] tt = new String[2];
		tt[0] = "name";
		
		System.out.println(ll.length);
		System.out.println(ll[0]);
		System.out.println("------");
		for(String l : ll) {
			System.out.println(l);
		}
	}
}
