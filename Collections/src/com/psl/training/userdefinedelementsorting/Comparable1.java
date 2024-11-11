package com.psl.training.userdefinedelementsorting;
import java.util.ArrayList;
import java.util.Collections;

public class Comparable1{

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(553,"Kavitha",75_000));
		list.add(new Employee(554,"Pranathi",55_000));
		list.add(new Employee(552,"Hima",30_000));
		list.add(new Employee(555,"Janani",45_000));
		list.add(new Employee(556,"Greeshma",65_000));
		System.out.println(list);
		System.out.println();
		
		for(Employee e:list) {
			System.out.println(e);
		}
		
		//Collections.sort(list);	compilation error sort applicable to list interface of wrapper class and string class elements
		System.out.println();
		System.out.println("Sorting the elements using Comparable Interface based on ID");
		Collections.sort(list);
		for(Employee e:list) {
			System.out.println(e);
		}
	}

	
}
