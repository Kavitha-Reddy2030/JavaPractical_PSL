package com.psl.training;
public class DivideByZero {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		try {
			int res=a/b;
			System.out.println("No exception occurred");
		}catch(Exception e){
			System.out.println("Exception occurred");
			e.printStackTrace();//prints exception description
			e.getMessage();//same it gives description of the exception occurred
		}
		System.out.println("Important");	//	executes
	}

}
