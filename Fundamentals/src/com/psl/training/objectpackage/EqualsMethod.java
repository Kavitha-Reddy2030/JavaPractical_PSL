package com.psl.training.objectpackage;

class Student1{
	private int id;
	private String name;
	public Student1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	//we can modify this to string method return stmt to our wish but we can't modify method signature
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class EqualsMethod {

	public static void main(String[] args) {
		Student1 student1=new Student1(553,"Kavitha");
		System.out.println(student1.hashCode());//hashcode() is also in object package
		
		Student1 student2=new Student1(553,"Kavitha");
		System.out.println(student2.hashCode());
		
		if(student1.equals(student2)==true) {	//Since they are referring to 2 different objects
			//Their objects have different addresses even though the values are same
			System.out.println("Objects are equal");
		}
		System.out.println("Objects are not equal");
	}

}
