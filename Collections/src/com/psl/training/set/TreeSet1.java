package com.psl.training.set;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();// Creates empty hash table

		// Insertion
		set.add(553);
		set.add(543);
		set.add(549);
		set.add(556);
		set.add(557);
		set.add(558);
		System.out.println(set);//  maintain ascending order of elements.
		set.add(558);// Doesn't allow duplicates no compilation error but prints only once
		System.out.println(set);
		//set.add(null);//doesn't allow multiple null values 
		System.out.println(set);
		set.remove(543);// removes the specified element
		System.out.println(set);
	}

}
