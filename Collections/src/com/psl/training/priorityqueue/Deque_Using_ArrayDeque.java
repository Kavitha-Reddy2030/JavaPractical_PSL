package com.psl.training.priorityqueue;

import java.util.ArrayDeque;

//Implementation of deque using ArrayDeque class
public class Deque_Using_ArrayDeque {

	public static void main(String[] args) {
		//In deque we can add elements in rear or front i.e.both ends
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.offer(553);
		queue.offer(554);
		queue.offer(555);
		queue.offer(556);
		queue.offer(557);//adds element in the last
		queue.offerLast(552);	//offer or offerlast both are same
		System.out.println(queue);
		
		//It is same as arraydeque
		//Similarly like insertion at both ends ,we can also remove elements from both ends using pollfirst and polllast
		//pollfirst removes first inserted element
		//polllast removes last inserted element
		System.out.println("First inserted element will be deleted: "+queue.pollFirst());
		System.out.println(queue);
		System.out.println("Last inserted element will be deleted: "+queue.pollLast());
		System.out.println(queue);
		queue.offerFirst(553);//adds element in the front
		System.out.println(queue);
	}

}
