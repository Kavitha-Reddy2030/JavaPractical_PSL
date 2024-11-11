package com.psl.training;

public class Calculator {

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, float b) { // add(float a,int b)--->same as this method
		System.out.println(a + b);
	}

	public void add(float a, float b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	//Always static and instance blocks execute first before main method execute
	/*
	 * Priority goes like this 
	 * static blocks
	 * instance blocks
	 * Default super class constructor
	 * Sub class constructor
	 * Super class methods
	 * sub class methods
	 */
			
	static {
		System.out.println("Static Block 1");
	}
	static {
		System.out.println("Static Block 2");
	}
	{
		System.out.println("Instance Block");
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.add(20, 30);
		calculator.add(20, 30f);
		calculator.add(20f, 30.0f);
		calculator.add(20, 30, 50);
	}

}
