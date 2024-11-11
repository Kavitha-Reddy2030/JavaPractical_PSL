package com.psl.training;

public class Operators{	//public class Operators extends Object
	//Every class is an extension of object class even if we put extends Object no error

	public static void main(String[] args) {
		int a=20,b=10,c=25;
		
		//Difference between logical(&&) and bitwise(&)
		System.out.println((a<b)&&(b++<c)); //If the 1st condition is false && logical AND operator doesn't go for 2nd condition at all
		System.out.println(b);
		
		System.out.println((a<b)&(b++<c)); //If the 1st condition is false & Bitwise operator go for 2nd condition and evaluates
		System.out.println(b);
		
		System.out.println((a>b)&&(b++<c));
		System.out.println(b);

		
		//Difference between logical(||) and bitwise(|)
		System.out.println((a>b)||(b++<c));  //logical OR checks if the 1st condition is true if its true it never go to next conditions and evaluate
		System.out.println(b);
		
		System.out.println((a>b)|(b++<c)); //If the 1st condition is false & Bitwise operator go for 2nd condition and evaluates
		System.out.println(b);
	}

}
