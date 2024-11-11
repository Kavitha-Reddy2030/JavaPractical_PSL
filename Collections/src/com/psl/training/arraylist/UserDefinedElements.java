package com.psl.training.arraylist;
import java.util.ArrayList;
class Student{
	private Integer id;
	private String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}

public class UserDefinedElements {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(553,"Kavitha"));
		list.add(new Student(554,"Pranathi"));
		list.add(new Student(555,"Janani"));
		list.add(new Student(556,"Greeshma"));
		Student e=new Student(557,"Vani");	//		Either of the ways
		list.add(e);
		
		System.out.println(list);
		
		for(Student i:list) {
			System.out.println(i);
		}
	}

}
