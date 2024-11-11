package com.psl.training;

public class Scope {
	int num = 20; // Instance Variable
	static int num1 = 30; // Static Variable

	public static void main(String[] args) {
		int num = 10; // Local Variable

		// Since main method is static we no need to have an object to access num which
		// is inside the main method
		System.out.println(num);

		Scope scope = new Scope();
		// Instance variable needs an object in order to access it
		System.out.println(scope.num);

		System.out.println(num1); // static variable can be accessed directly without creation of any object
		//internally JVM creates scope.num1
	}

}
