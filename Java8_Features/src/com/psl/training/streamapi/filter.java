package com.psl.training.streamapi;
import java.util.ArrayList;

public class filter {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(553);
		list.add(554);
		list.add(555);
		list.add(556);
		list.add(557);
		System.out.println(list);
		
		//list of odd numbers
		
		//Without stream
		System.out.println("List of odd numbers without using stream");
		for(Integer i:list) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		//with stream
		//1.filter method---->If we want only some specific elements
		System.out.println("List of odd numbers using stream");
		list.stream()	//stream is used to store collection list elements
		.filter(a->(a%2!=0))
		.forEach(System.out::println);
	}

}
