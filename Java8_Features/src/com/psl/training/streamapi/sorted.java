package com.psl.training.streamapi;

import java.util.ArrayList;

public class sorted {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(553);
		list.add(554);
		list.add(555);
		list.add(552);
		list.add(556);
		list.add(557);
		System.out.println(list);
		
		System.out.println("List of elements in sorted order");
		list.stream().sorted().forEach(System.out::println);
	}

}
