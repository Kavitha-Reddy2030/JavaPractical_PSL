package com.psl.training.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_ArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(553);
		list1.add(556);
		list1.add(557);
		list1.add(558);
		System.out.println(list1);
		
		System.out.println("Iterating through array elements");
		
		//1.Using iterator interface
		//Iterator interface iterates only in forward direction
		System.out.println("Traversing the list using iterator interface");
		Iterator iter=list1.iterator();	//iterator is an method  iter is object or reference variable
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//2.Using for loop
		System.out.println("Traversing the list using for loop");
		for(Integer i:list1) {
			System.out.println(i);
		}
		
		//3.Using ListIterator interface
		System.out.println("Traversing the list using ListIterator interface");
		//It iterates the list elements in both the directions
		
		System.out.println("Forward Direction traversing");
		Iterator iter1=list1.iterator();	//iterator is an method  iter1 is object or reference variable
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		System.out.println("Backward Direction traversing");
		int size=list1.size();
		ListIterator iter2=list1.listIterator(size);	//iterator is an method  iter1 is object or reference variable
		while(iter2.hasPrevious()) {
			System.out.println(iter2.previous());
		}
		
		//4.Using forEach Method
		//Functional Programming approach ---->Lambda Expression
		System.out.println("Traversing the list using forEach method");
		list1.forEach(i->{
			System.out.println(i);
		});
		
		//5.Using forEachRemaining Method
		System.out.println("Traversing the list using forEachRemaining method");
		Iterator iter3=list1.iterator();
		iter3.forEachRemaining(i->{
			System.out.println(i);
		});
	}

}
