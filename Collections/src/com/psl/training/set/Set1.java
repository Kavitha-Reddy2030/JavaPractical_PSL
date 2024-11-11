package com.psl.training.set;

import java.util.HashSet;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();//Creates empty hash table

		// Insertion
		set.add(553);
		set.add(543);
		set.add(549);
		set.add(556);
		set.add(557);
		set.add(558);
		System.out.println(set);//doesn't maintain insertion order.It calculates hash value for every elemnet using hashtable
		set.add(558);//Doesn't allow duplicates no compilation error but prints only once
		System.out.println(set);
		set.add(null);//allows multiple null values but prints only once
		System.out.println(set);
		set.add(null);
		System.out.println(set);
		set.remove(543);//removes the specified element
		System.out.println(set);
		//Collections.sort()---->doesn't work
		//If we want to sort we use tree set
		
		
		
		HashSet<Integer> set2 = new HashSet<Integer>();//Creates empty hash table

		// Insertion
		set2.add(553);
		set2.add(543);
		set2.add(549);
		set2.add(556);
		set2.add(557);
		set2.add(558);
		System.out.println("Before sorting the set: "+set2);
		TreeSet<Integer> set1 = new TreeSet<Integer>(set2);
		System.out.println("After sorting the set: "+set1);
	}

}
