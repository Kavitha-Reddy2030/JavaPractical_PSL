package com.psl.training.set;

import java.util.LinkedHashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class LinkedHashSet1 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();// Creates empty hash table

		// Insertion
		set.add(553);
		set.add(543);
		set.add(549);
		set.add(556);
		set.add(557);
		set.add(558);
		System.out.println(set);//maintains insertion order.
		set.add(558);// Doesn't allow duplicates no compilation error but prints only once
		System.out.println(set);
		//set.add(null);// allows multiple null values but prints only once
		System.out.println(set);
		//set.add(null);
		System.out.println(set);
		set.remove(543);// removes the specified element
		System.out.println(set);
		
		//sorting linked hash set using tree set
		TreeSet<Integer> set1 = new TreeSet<Integer>(set);
		System.out.println("After sorting the set using tree set: "+set1);
		
		ArrayList<Integer> set2=new ArrayList<Integer>(set);
		System.out.println(set2);
		Collections.sort(set2);
		System.out.println("After sorting the set using arraylist collections sort method: "+set2);
		
	}

}
