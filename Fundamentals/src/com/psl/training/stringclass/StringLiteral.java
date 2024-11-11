package com.psl.training.stringclass;

public class StringLiteral {
	
	/*
	 *String Literal   //recommended way
	 *new keyword
	 */
	
	//Strings are immutable in java which mean we can't change its value
	//String class also override toString()

	public static void main(String[] args) {
		
		String str="KAVITHA";	//All string literals are stored in string constant pool which is subset of heap memory
		System.out.println("Initial String: "+str);
		str.concat("IPPALA");
		System.out.println("After modification :"+str);//Since strings are immutable
		//but we can do this by assigning to a new variable it means referring to a new address
		String str1=str.concat(" IPPALA");//We can use same variable also but original is lost that means changes takes place to that value by newly modified ones
		System.out.println("Final String: "+str1);
	}

}
