package com.psl.training;

public class Elipsis {
	int max(int num, int... arr) {	//Elipsis is always used with the methods 
		//and it must be the last argument in an list of arguments of a function
		
		int high = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > high)
				high = arr[i];
		}
		return high;
	}

	public static void main(String... args) {
		Elipsis elipsis = new Elipsis();
		System.out.println(elipsis.max(12, 23, 43, 29));

	}

}
