package com.psl.training.arraylist;

import java.util.ArrayList;

//import java.util.ArrayList;
public class ArrayList1 {

	public static void main(String[] args) {
		//Non-Generic Collections
		ArrayList list=new ArrayList();
		list.add(553);
		list.add("Kavitha");
		list.add(5-11-2001);//It thinks it is an expression but not date
		System.out.println(list);
		
		//Generic Collections
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(553);
		//list1.add("KA");	//throws compilation error accepts only integer type
		list1.add(556);
		list1.add(557);
		list1.add(558);
		list1.add(null);	 //accepts null values
		list1.add(null);	//Multiple null values also accepted
		System.out.println(list1);//sequential order

	}

}
