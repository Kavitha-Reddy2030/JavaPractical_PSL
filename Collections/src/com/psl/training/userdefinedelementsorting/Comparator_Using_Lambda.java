package com.psl.training.userdefinedelementsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator_Using_Lambda {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(553,"Kavitha",75_000.0f));
		list.add(new Student(554,"Pranathi",55_000));
		list.add(new Student(552,"Hima",30_000));
		list.add(new Student(555,"Janani",45_000));
		list.add(new Student(556,"Greeshma",65_000));
		System.out.println(list);
		System.out.println();
		
		for(Student s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorting the user defined elements using comparator interface with lambda expression");
		Comparator<Student> sortByName=(s1,s2)->s1.getName().compareTo(s2.getName());
		Collections.sort(list,sortByName);	//sort by NAME
		for(Student s:list) {
			System.out.println(s);
		}
		
		System.out.println();
		System.out.println("Sorting the user defined elements using comparator interface with lambda expression");
		Comparator<Student> sortById=(s1,s2)->s1.getId()-(s2.getId());
		Collections.sort(list,sortById);	//sort by ID
		for(Student s:list) {
			System.out.println(s);
		}
	}

}
