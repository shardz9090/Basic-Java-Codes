package com.khecc.day3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		String[] name = new String[200];
		name[0] = "a";
		name[1] = "b";
		
		for(int i =0; i<4; i++) {
			System.out.println(name[i]);
		}
		System.out.println(">>>>");
		for(String data: name) {
			if(data != null)
				System.out.println(data);
		}
		
//		List<String> list = new LinkedList<String>();
		List<String> list = new ArrayList();
		list.add("asdfsdf");
		list.add("sdf");
		list.add("sdf");
//		list.remove(0);
		System.out.println(list.get(2));
		for(String tt : list) {
			System.out.println(tt);
		}
		
		System.out.println("------");
		List<Object> lists = new ArrayList();
		lists.add(true);
		lists.add("sdf");
		for(Object value : lists) {
			System.out.println(value);
		}
		
//		Set<String> sett = new HashSet<String>();
		Set<String> sett = new LinkedHashSet<String>();
		sett.add("a");
		sett.add("g");
		sett.add("");
		sett.add("a");
		for(String tt : sett) {
			System.out.println(tt);
		}
	}

}
