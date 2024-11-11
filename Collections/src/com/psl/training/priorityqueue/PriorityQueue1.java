package com.psl.training.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		PriorityQueue<Integer> queue=new PriorityQueue<Integer>();
		queue.offer(553);
		queue.offer(554);
		queue.offer(555);
		queue.offer(556);
		queue.offer(557);
		//queue.offer(null);//runtime exception but no compilation error
		//queue.offer(null);//so PQ doesn't allow null values
		System.out.println(queue);
		queue.offer(553);	//allows duplicates
		System.out.println(queue);
		queue.offer(554);
		queue.offer(564);
		queue.offer(552);
		
		System.out.println(queue);	//output is not sequential as we inserted it prints based on priority
		System.out.println(queue);
		System.out.println("Head of the Queue: "+queue.peek());
		System.out.println("Removes Head of the Queue:  "+queue.poll());	//tells what is head element that is going to be deleted
		System.out.println(queue);
		System.out.println("Removes Head of the Queue:  "+queue.poll());
		System.out.println(queue);
		
		//Collections.sort(queue); sort applies only for list interface
	}

}
