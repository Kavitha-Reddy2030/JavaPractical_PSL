package com.psl.training.arraylist;
import java.util.Stack;
public class StackDS {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<Integer>();
		stack.push(553);
		stack.push(554);
		stack.push(555);
		stack.push(556);
		stack.push(557);
		System.out.println(stack);
		
		for(Integer i:stack) {
			System.out.println(i);
		}
		
		stack.pop();
		System.out.println(stack);	//removes the last inserted element
	}

}
