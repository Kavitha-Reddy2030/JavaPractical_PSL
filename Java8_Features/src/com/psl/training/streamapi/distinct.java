package com.psl.training.streamapi;

import java.util.ArrayList;

public class distinct {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(553);
		list.add(554);
		list.add(555);
		list.add(556);
		list.add(557);
		list.add(553);
		list.add(554);
		System.out.println(list);
		
		System.out.println("Size of the list");
		long size=list.stream().count();
		System.out.println(size);
		System.out.println("List of distinct elements");
		list.stream().distinct().forEach(System.out::println);
		System.out.println("Size of the list");
		long size1=list.stream().count();
		System.out.println(size1);
	}

}
