package com.psl.training.priorityqueue;

import java.util.ArrayDeque;
import java.util.Collections;

public class ArrayDeque1 {

	public static void main(String[] args) {
		ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
		queue.offer(553);
		queue.offer(554);
		queue.offer(555);
		queue.offer(556);
		queue.offer(557);
		queue.offer(557);//Allows duplicates
		//queue.offer(null);//Executes with no compilation error but runtime exception occurs
		queue.offerLast(552);	//offer or offerlast both are same
		System.out.println(queue);
		queue.offerLast(558);
		System.out.println(queue);
		
		queue.poll();	//poll or pollfirst also works similar.It removes the first inserted elements.i.e;front end element
		System.out.println(queue);
		queue.pollFirst();
		System.out.println(queue);
		System.out.println("Remove "+queue.poll());	//	it prints what element deleted
		System.out.println(queue);
		System.out.println("Head of the queue "+queue.peek());
		queue.offerLast(553);//adds element in the last
		System.out.println(queue);
		queue.offerFirst(553);//adds element in the first
		System.out.println(queue);
		System.out.println("Head of the queue "+queue.peek());
		//Collections.sort(queue); sort() applicable only for list interface
	}

}
