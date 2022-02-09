package com.collection;

import java.util.LinkedList;
import java.util.Queue;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of Queue Program
 */
public class QueueProgram {

	public static void main(String[] args) {
		int size = 10;
		String className = "QueueProgram";
		Queue<Integer> queue = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			queue.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, "" + queue);
		/*
		 * remove() & poll() difference is if queue will be empty then remove() throws
		 * exception but poll() returns null
		 */
		CallingLogger.getInfoLoggerFrom(className, "Remove element from head using remove()... " + queue.remove());
		CallingLogger.getInfoLoggerFrom(className, "Remove element from head using poll()... " + queue.poll());
		CallingLogger.getInfoLoggerFrom(className, "" + queue);
		CallingLogger.getInfoLoggerFrom(className, "Getting element from head using peek()... " + queue.peek());
		CallingLogger.getInfoLoggerFrom(className, "Getting element from head using element()... " + queue.element());
		CallingLogger.getInfoLoggerFrom(className, "" + queue);
		CallingLogger.getInfoLoggerFrom(className, "Check if queue is empty or not... " + queue.isEmpty());
		CallingLogger.getInfoLoggerFrom(className, "Check the size of queue... " + queue.size());
		CallingLogger.getInfoLoggerFrom(className, "It will be add element from tail... " + queue.offer(11));
		CallingLogger.getInfoLoggerFrom(className, "" + queue);
	}

}