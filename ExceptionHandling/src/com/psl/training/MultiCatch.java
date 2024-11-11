package com.psl.training;

public class MultiCatch {

	public static void main(String[] args) {

		int a = 100;
		int b = 0;
		try {
			int res = a / b;
			System.out.println("No exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();// prints exception description
		}
		catch(ArithmeticException e) {
			
			//We must specify catch blocks from subclasses to super class otherwise it will be an compilation error
			System.out.println("Arithmetic Exception occurred");	//checks for exception corresponding catch block
		}

		System.out.println("Important"); //executes
	}

}
