package com.psl.training.linkedlist;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();//creates an empty doubly linked list
		
		//Insertion		
		list.add("Kavitha");
		list.add("Pranathi");
		list.add("Janani");
		list.add("Greeshma");
		list.add("Vani");
		
		System.out.println(list);//sequential order
		
		//Deletion
		list.remove("Vani");
		System.out.println(list);	//Removing based on list element
		list.remove(1);
		System.out.println(list);	//	removing based on index
		
		//Search
		if(list.contains("Kavitha")) {	//case-sensitive also matters
			System.out.println("Element is present in the lsit");
		}
		else {
			System.out.println("Element is not present in the lsit");
		}
		
		//Appending
		LinkedList<String> list1=new LinkedList<String>();
		list1.add("Suchitha");
		list1.add("Angel");
		list1.add("Shravya");
		list1.add("Amulya");
		list1.add("Habeeb");
		list1.add("Kavitha");	//	allows duplicates and prints twice
		list1.add(null);
		list1.add(null);//multiple null values also accepted
		list1.addAll(list);
		
		System.out.println(list1);
		
		/*
		 * //Sorting the list elements but we can't sort if the list contains null values
		 * Collections.sort(list1);
		 * System.out.println(list1);
		 */
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("Suchitha");
		list2.add("Angel");
		list2.add("Shravya");
		list2.add("Amulya");
		list2.add("Habeeb");
		list2.add("Kavitha");
		System.out.println(list2);
		
		Collections.sort(list2);
		System.out.println(list2);
		
	}

}
