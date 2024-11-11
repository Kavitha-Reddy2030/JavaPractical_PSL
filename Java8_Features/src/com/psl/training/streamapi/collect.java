package com.psl.training.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class collect {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Kavitha");
		list.add("Pranathi");
		list.add("Janani");
		list.add("Greeshma");
		list.add("Vani");
		
		
		//Traversing the list
		System.out.println("List of elements");
		list.stream()
		.forEach(System.out::println);
		
		//if we want the string elements in uppercase and placed in other list
		System.out.println();
		System.out.println("List of elements in uppercase and moved to another list");
		List<String> list_upper=list.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
		list_upper.stream()
		.forEach(System.out::println);
		

	}

}
