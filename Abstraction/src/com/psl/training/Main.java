package com.psl.training;


abstract class Calculate{
	abstract int test(int a,int b);
}

class Add extends Calculate{

	@Override
	int test(int a, int b) {
		int res1=a+b;
		return res1;
		
	}
	
}
class Sub extends Calculate{

	@Override
	int test(int a, int b) {
		int res2=a-b;
		return res2;
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		Add add=new Add();
		int ans1=add.test(100,200);
		System.out.println(ans1);
		Sub sub=new Sub();
		int ans2=sub.test(200, 100);
		System.out.println(ans2);
	}

}
