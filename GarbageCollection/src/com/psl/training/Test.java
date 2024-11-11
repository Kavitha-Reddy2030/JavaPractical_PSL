package com.psl.training;

public class Test {

	public static void main(String[] args) {
		String str="Kavitha";
		System.out.println(str.length());
		str=null;
		System.gc();

	}
	//so no need to call finalize method explicitly
	@Override
	protected void finalize() {//garbage collector automatically calls finalize method of String class ,but it is user defined finalize method
		System.out.println("All resources has been released");//To close all the connetions
	}

}
