package com.psl.training.linkedlist;

import java.util.LinkedList;

//Implementation of queue data structure using linked list
public class Queue_Using_Linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.offer(553);
		list.offer(554);
		list.offer(555);
		list.offer(556);
		list.offer(557);//adds element in the last
		list.offerLast(552);	//offer or offerlast both are same
		System.out.println(list);
		
		//It is same as arraydeque
		//Similarly like insertion at both ends ,we can also remove elements from both ends using pollfirst and polllast
		//pollfirst removes first inserted element
		//polllast removes last inserted element
		System.out.println("First inserted element will be deleted: "+list.pollFirst());
		System.out.println(list);
		System.out.println("Last inserted element will be deleted: "+list.pollLast());
		System.out.println(list);
		list.offerFirst(553);//adds element in the front
		System.out.println(list);
	}


	}


