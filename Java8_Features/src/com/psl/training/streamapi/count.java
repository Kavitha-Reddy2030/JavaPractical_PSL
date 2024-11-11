package com.psl.training.streamapi;

import java.util.ArrayList;

public class count {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(553);
		list.add(554);
		list.add(555);
		list.add(556);
		list.add(557);
		System.out.println(list);
		
		System.out.println("Size of the list");
		long size=list.stream().count();
		System.out.println(size);
	}

}
