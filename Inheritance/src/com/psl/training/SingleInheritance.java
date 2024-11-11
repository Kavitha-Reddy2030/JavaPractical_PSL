package com.psl.training;

class Employee{
	protected String companyName="PSL";
	protected int id;
	protected int noOfEmp=100;
	/*
	 * If we want to assign value to instance variable then either
	 * gettersetter/constructor
	 */
	/*
	 * Employee() { System.out.println("Super class constructor"); }
	 */
	
	Employee(String department,int id) {
		this.id=id;
		System.out.println("Super class parameterized constructor: "+id);
		System.out.println("Super class parameterized constructor: "+department);
	}
	public void print() {
		System.out.println("Super class company name:"+companyName);
	}
	void getInfo() {
		System.out.println("Employee Information");
	}
}

class Developer extends Employee{
	/*
	 * If we have only parameterized constructor, then we must have that
	 * parameterized construcor in sub class also otherwise compiler throws an error
	 */
	protected int noOfEmp=200;
	Developer(String department,int id) {
		super(department,id);
	}
	private int salary=50_000;

	/*
	 * Developer(){ System.out.println("Sub class constructor"); }
	 */
	//We can also call immediate parent method in sub class using super keyword
	public void display() {
		System.out.println("Sub class company name:"+companyName); //jvm adds super.companyName
		System.out.println("Sub class salary:"+salary); 
		System.out.println("Sub class no.of.Employees:"+noOfEmp); //Priority goes to local variable
	}
	void getInfo() {
		System.out.println("Developer Information");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		//Using sub class object we can access both sub class and parent class methods
		Developer developer=new Developer("DEVELOPER",553); //This object creation internally calls parent class constructor
		//and then sub class constructor Becoz jvm add default constructor if we don't explicitly provide
		//If we provide explicitly then they will be executed
		developer.print();
		developer.display();
		
		//If we call 2 times the method which is common in parent and sub classes and calling that method
		//using sub class object then it calls sub class method only for 2 times
		developer.getInfo();
		developer.getInfo();
		
		//If we have a parameterized constructor in parent class then we need to call that constructor in sub class explicitly
		//Otherwise it will be an compilation error
	}

}
