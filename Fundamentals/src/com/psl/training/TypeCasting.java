package com.psl.training;

public class TypeCasting {
	
	//Implicit-converting lower datatypes into higher datatypes
	//Explicit-converting higher datatypes into lower datatypes
	//byte-->short-->int-->long-->float 
			//char					double
	//from left to right lower to higher datatype
	public static void main(String[] args) {
		
		//Implicit Type Casting
		
		int num1=10;
		float num3=num1;	//We can assign a lower datatype to a higher datatype  --->Implicit conversion
		float num2=3.5f;  //all float variable initialization must be suffixed with either 'f' or 'F'
		float add;
		float sub;
		add=num1+num2;   //float=int+float
		sub=num3-num2;
		System.out.println(add);    //result is always should be a higher datatype of given input types
		System.out.println(sub);
	
	
	//Explicit Type Casting
	
	int num4=10;
	double num5=5.5;
	double num6=34.5;
	int num7=(int)num6;
	int num8=20;
	int sub1;
	//float add1=(num4+num5);   //compilation error becoz result i.e,add1 is of float type which is lower datatype than input datatypes(num5 which is a lon type)
	//Hence we need to type cast the result variable to double type or we need to explicitly change result to be of float type
	
	float add1=(float)(num4+num5); 
	sub1=num7-num8;
	System.out.println(add1);    //result is always should be a higher datatype of given input types otherwise we need to down cast
	System.out.println(sub1);
	
	}
}
