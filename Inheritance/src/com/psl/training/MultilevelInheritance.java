package com.psl.training;

class A {
	protected String str = "A";

	public void printA() {
		System.out.println("Base class--->class A");
		System.out.println("str");
	}

}

class B extends A {
	
	String str1 = "B";

	public void printB() {
		printA();
		System.out.println("Child class--->class B");
		System.out.println("str1");
	}

}

class C extends B {

	String str2 = "C";

	public void printC() {
		printA();
		printB();
		System.out.println("Child class--->class C");
		System.out.println("str2");
	}

}

public class MultilevelInheritance {

	public static void main(String[] args) {
		B b=new B();
		C c=new C();
		b.printB();
		c.printC();
	}

}
