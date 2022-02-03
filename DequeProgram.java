package com.Collection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of Deque Program
 */
public class DequeProgram {

	public static void main(String[] args) {
		int size = 10;
		Deque<Integer> deque = new ArrayDeque<>();
		for (int count = 0; count <= size; count++) {
			deque.add(count);
		}
		System.out.println(deque);
		deque.addFirst(-1);
		System.out.println("Add element at first position... " + deque);
		deque.addLast(11);
		System.out.println("Add element at last position... " + deque);
		deque.push(-2);
		System.out.println("Add element at first position using push()... " + deque);
		deque.offerFirst(-3);
		System.out.println("Add element at First position using offerFirst()... " + deque);
		deque.offer(12);
		System.out.println("Add element at last position using offer()... " + deque);
		System.out.println("Getting element from head using peek()... " + deque.peek());
		System.out.println("Getting element from head using element()... " + deque.element());
		System.out.println(deque);
		System.out.println("Check if deque is empty or not... " + deque.isEmpty());
		System.out.println("Check the size of deque... " + deque.size());
		deque.removeFirst();
		System.out.println("Remove element at First position using removeFirst()... " + deque);
		deque.removeLast();
		System.out.println("Remove element at last position using removelast()... " + deque);
		System.out.println(deque);
		/*
		 * remove() & poll() difference is if deque will be empty then remove() throws
		 * exception but poll() returns null
		 */
		System.out.println("Remove element from head using remove()... " + deque.remove());
		System.out.println("Remove element from head using poll()... " + deque.poll());
	}

}