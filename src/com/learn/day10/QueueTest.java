package com.learn.day10;

import java.util.PriorityQueue;

public class QueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queueTest = new PriorityQueue<>();
		queueTest.offer("A");
		queueTest.offer("B");
		queueTest.offer("C");
		queueTest.offer("D");
	
		System.out.println(queueTest);
		System.out.println(queueTest.poll());
		System.out.println(queueTest);
		
		System.out.println(queueTest.peek());
		System.out.println(queueTest);

	}

}
