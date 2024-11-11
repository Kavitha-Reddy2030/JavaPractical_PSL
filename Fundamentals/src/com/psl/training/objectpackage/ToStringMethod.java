package com.psl.training.objectpackage;

class Student{
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class ToStringMethod {
	
	public static void main(String[] args) {
		Student student=new Student(553,"Kavitha");
		System.out.println(student);	//It gives ghe address of the object in memory
		//If we want to print their values we need to override toString()
	}

}
