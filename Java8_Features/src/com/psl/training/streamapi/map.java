package com.psl.training.streamapi;
import java.util.ArrayList;

public class map {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Kavitha");
		list.add("Pranathi");
		list.add("Janani");
		list.add("Greeshma");
		list.add("Vani");
		
		
		//Traversing the list
		list.stream()
		.forEach(System.out::println);
		
		//list of string elements in uppercase
		//without stream
		System.out.println();
		System.out.println("list of string elements in uppercase without using stream");
		for(String str:list) {
			System.out.println(str.toUpperCase());
		}
		
		//with stream
		//map-it require and change all list elements
		System.out.println();
		System.out.println("list of string elements in uppercase using stream");
		list.stream()
		.map(str->str.toUpperCase())
		.forEach(System.out::println);
		
	}

}
