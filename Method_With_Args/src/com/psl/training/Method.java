package com.psl.training;
import java.util.*;
public class Method {
	// static method to find the largest number in an array
	static int maximum(int arr[],int num) {
		int max=arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]>arr[i-1]) {
				max=arr[i];
			}
		}
		//System.out.println(max);
		return max;
		
	}
	
	int max(int arr[],int num) {  //Instance method
		int max=arr[0];
		for(int i=1;i<num;i++) {
			if(arr[i]>arr[i-1]) {
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Method method=new Method();
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int result=maximum(arr,n); 		//Directly we can call static method
		System.out.println(result);
		System.out.println(method.max(arr, n)); //Need to call instance method with an object
	}
}
