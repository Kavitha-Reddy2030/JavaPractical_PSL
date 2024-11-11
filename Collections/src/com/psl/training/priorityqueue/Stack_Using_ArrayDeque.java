package com.psl.training.priorityqueue;

import java.util.ArrayDeque;

//Implementation of stack data structure using arraydeque class
public class Stack_Using_ArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.push(553);
		queue.push(554);
		queue.push(555);
		queue.push(556);
		queue.push(557);
		System.out.println(queue);
		System.out.println("Head of stack: "+queue.peek());
		System.out.println("Head of stack or top of the stack to be deleted: "+queue.poll());
		System.out.println(queue);
	}

}
