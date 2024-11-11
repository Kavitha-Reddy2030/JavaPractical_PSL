package com.psl.training;
import java.util.*;
public class Maximum {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	
	int max() {  //Instance method
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>arr[i-1]) {
				max=arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		Maximum maximum=new Maximum();
		int result=maximum.max(); 
		System.out.println(result);
		System.out.println(maximum.max()); //Need to call instance method with an object
	}

}
