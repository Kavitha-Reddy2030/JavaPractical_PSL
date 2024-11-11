package com.psl.training;

public class MultipleException {

	public static void main(String[] args) {
		int a = 100;
		int b = 0;
		try {
			int arr[]=new int[10];//Always 1stexception will be handled and the remaining will not be executed
			System.out.println(arr[11]);
			int res = a / b;
			System.out.println("No exception occurred");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Bounds of Exception occurred");
			e.printStackTrace();// prints exception description
		}
		catch(ArithmeticException e) {
			
			//We must specify catch blocks from subclasses to super class otherwise it will be an compilation error
			System.out.println("Arithmetic Exception occurred");	//checks for exception corresponding catch block
		}

		System.out.println("Important"); // Doesn't get executes

	}

}
