package com.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Of Queue Program
 */
public class QueueProgram {

	public static void main(String[] args) {
		int size = 10;
		Queue<Integer> queue = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			queue.add(count);
		}
		System.out.println(queue);
		/*
		 * remove() & poll() difference is if queue will be empty then remove() throws
		 * exception but poll() returns null
		 */
		System.out.println("Remove element from head using remove()... " + queue.remove());
		System.out.println("Remove element from head using poll()... " + queue.poll());
		System.out.println(queue);

		System.out.println("Getting element from head using peek()... " + queue.peek());
		System.out.println("Getting element from head using element()... " + queue.element());
		System.out.println(queue);

		System.out.println("Check if queue is empty or not... " + queue.isEmpty());
		System.out.println("Check the size of queue... " + queue.size());

		System.out.println("It will be add element from tail... " + queue.offer(11));
		System.out.println(queue);
	}

}