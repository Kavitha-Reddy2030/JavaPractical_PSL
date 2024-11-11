package com.psl.training;

public class Test {

	public static void main(String[] args) {
		int a=100;
		int b=0;
		try {
			int res=a/b;
			System.out.println("No exception occurred");
		}catch(ArrayIndexOutOfBoundsException e){   //since the exception doesn't matched
			//Default exception handler will be take care of this and this catch block won't be executed
			System.out.println("Exception occurred");
			e.printStackTrace();//prints exception description
		}
		finally{	//executes irrespective of the exception handled or not
			System.out.println("Always Executes"); //It must be after all catches
			//There should not be any intermediatary stmts b/w catch and finally
		}

		System.out.println("Important");	//	Doesn't get executes
	}

}
