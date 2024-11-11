package com.psl.training.userdefinedelementsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class sortById implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getId()-o2.getId();
	}
	
}

class sortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Comparator1 {

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
		System.out.println("Sorting the elements using Comparator Interface based on ID");
		Collections.sort(list,new sortById());
		for(Student e:list) {
			System.out.println(e);
		}
		
		System.out.println();
		System.out.println("Sorting the elements using Comparator Interface based on NAME");
		Collections.sort(list,new sortByName());
		for(Student e:list) {
			System.out.println(e);
		}

	}

}
