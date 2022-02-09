package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of Deque Program
 */
public class DequeProgram {

	public static void main(String[] args) {
		int size = 10;
		String className = "DequeProgram";
		Deque<Integer> deque = new ArrayDeque<>();
		for (int count = 0; count <= size; count++) {
			deque.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, "" + deque);
		deque.addFirst(-1);
		CallingLogger.getInfoLoggerFrom(className, "Add element at first position... " + deque);
		deque.addLast(11);
		CallingLogger.getInfoLoggerFrom(className, "Add element at last position... " + deque);
		deque.push(-2);
		CallingLogger.getInfoLoggerFrom(className, "Add element at first position using push()... " + deque);
		deque.offerFirst(-3);
		CallingLogger.getInfoLoggerFrom(className, "Add element at First position using offerFirst()... " + deque);
		deque.offer(12);
		CallingLogger.getInfoLoggerFrom(className, "Add element at last position using offer()... " + deque);
		CallingLogger.getInfoLoggerFrom(className, "Getting element from head using peek()... " + deque.peek());
		CallingLogger.getInfoLoggerFrom(className, "Getting element from head using element()... " + deque.element());
		CallingLogger.getInfoLoggerFrom(className, "" + deque);
		CallingLogger.getInfoLoggerFrom(className, "Check if deque is empty or not... " + deque.isEmpty());
		CallingLogger.getInfoLoggerFrom(className, "Check the size of deque... " + deque.size());
		deque.removeFirst();
		CallingLogger.getInfoLoggerFrom(className, "Remove element at First position using removeFirst()... " + deque);
		deque.removeLast();
		CallingLogger.getInfoLoggerFrom(className, "Remove element at last position using removelast()... " + deque);
		CallingLogger.getInfoLoggerFrom(className, "" + deque);
		/*
		 * remove() & poll() difference is if deque will be empty then remove() throws
		 * exception but poll() returns null
		 */
		CallingLogger.getInfoLoggerFrom(className, "Remove element from head using remove()... " + deque.remove());
		CallingLogger.getInfoLoggerFrom(className, "Remove element from head using poll()... " + deque.poll());
	}

}