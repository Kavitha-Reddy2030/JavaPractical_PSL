package com.psl.training;

@FunctionalInterface	//	we can have any no.of static and default methods in functional interface but only 1abstract method
interface Student{
	void getInfo(int id,String name,String city);
	static void message() {
		System.out.println("Static Method");
	}
	default void info() {
		System.out.println("Default Method");

	}
}

public class FunctionalInterface_Using_MethodReference {
	
	public static void display(int id, String name, String city){//static method
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
		System.out.println("Student City: "+city);
	}

	public static void main(String[] args) {
		
		//For instance method
		//create class object
		//FunctionalInterface_Using_MethodReference obj=new FunctionalInterface_Using_MethodReference();
		//student.getInfo(553, "Kavitha","Ongole");
		
		
		//for static method
		//just provide class name
		Student student=FunctionalInterface_Using_MethodReference::display;
		student.getInfo(553, "Kavitha","Ongole");//we are calling getInfo() but got implementation of display
		//becoz we are referring display method
		
		Student.message();
		student.info();
		

	}

}
