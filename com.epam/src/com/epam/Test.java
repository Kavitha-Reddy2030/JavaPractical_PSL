
// Input: A[] = {-7, 1, 5, 2, -4, 3, 0} 
// Output: 3 

// i j k
// 1 -7 
package com.epam;

public class Test {
	public static void main(String[] args) {
		int arr[]= {-7, 1, 5, 2, -4, 3, 0};
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int left_sum=0;
			int right_sum=0;
			for(int j=i-1;j>=0;j--) { 
				left_sum+=arr[j];
			}
			for(int k=i+1;k<n;k++) {
				right_sum+=arr[k];
			}
			if(left_sum==right_sum) {
				System.out.println(i);
			}
		}
	}

}
