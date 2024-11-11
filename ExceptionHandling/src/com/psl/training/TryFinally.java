package com.psl.training;

public class TryFinally {

	public static void main(String[] args) {
		int a=10,b=0;
		try {	//		default handler will look into the exception occurred
			int res=a/b;
		}finally {
			System.out.println("Either of the catch or finally block must be followed for try block");
		}
	}

}
