package com.psl.training.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Properties {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		// Insertion
		list.add(553);
		list.add(556);
		list.add(557);
		list.add(558);
		System.out.println(list);

		// Deletion
		list.remove(2); // using index which starts from 0
		System.out.println(list);
		list.add(553);
		System.out.println(list);// List accepts duplicate values and prints twice

		// Search
		if (list.contains(553)) {
			System.out.println("Element is present in the list");
		} else {
			System.out.println("Element is not present in the list");
		}

		// Appending one list into another list
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		list1.add(543);
		list1.add(546);
		list1.add(547);
		list1.add(548);
		list1.add(549);
		System.out.println(list);
		list1.addAll(list);
		System.out.println(list1);
		
		//Sorting the list elements
		//list1.add(null); we can't sort if list contains null elements
		Collections.sort(list1);
		System.out.println(list1);
	}

}
