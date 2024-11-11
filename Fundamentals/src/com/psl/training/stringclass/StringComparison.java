package com.psl.training.stringclass;

public class StringComparison {

	public static void main(String[] args) {
		String str1="Kavitha";
		String str2="Kavitha";
		//Equals method is recommended way for string comparison
		System.out.println(str1.equals(str2));	//true both are referring to same address since thet are string literals JVm checks for that string already exist in string pool
		
		String str3="KAVITHA";
		String str4="kavitha";
		System.out.println(str3.equals(str4));	//false  case sensitive matters
		System.out.println(str3.equalsIgnoreCase(str4));	
		System.out.println(str3==str4);	
		System.out.println(str1==str2);	//check for same address or not
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}

}
