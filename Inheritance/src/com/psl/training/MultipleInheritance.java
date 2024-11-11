package com.psl.training;

interface AClass{
	
	//We can have static and default methods in interfaces 
	public default void printA()
	{
		System.out.println("Interface A");
	}
}
interface BClass{
	public static void printB() {
		System.out.println("Interface B");
	}
}

//Multiple inheritance can be acheived through interfaces
class Test implements AClass,BClass{
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Test test=new Test();
		test.printA();  
		BClass.printB();  //Since it is a static method we can call using interface

	}

}
