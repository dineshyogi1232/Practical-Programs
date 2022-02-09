package com.collection;

import java.util.LinkedList;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Of LinkedListProgram Program
 */
public class LinkedListProgram {

	public static void main(String[] args) {
		int size = 10;
		String className = "LinkedListProgram";
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			linkedList.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, linkedList.toString());
		CallingLogger.getInfoLoggerFrom(className, "Add element from head... " + linkedList.offerFirst(-1));
		CallingLogger.getInfoLoggerFrom(className, linkedList.toString());
		CallingLogger.getInfoLoggerFrom(className, "Add element from tail... " + linkedList.offerLast(11));
		CallingLogger.getInfoLoggerFrom(className, linkedList.toString());
		CallingLogger.getInfoLoggerFrom(className, "Remove element using pop()... " + linkedList.pop());
		linkedList.add(3, 12);
		CallingLogger.getInfoLoggerFrom(className, "Add element at index no 3... " + linkedList);
		CallingLogger.getInfoLoggerFrom(className, "Getting element using index no... " + linkedList.get(4));
		CallingLogger.getInfoLoggerFrom(className, "Sublist... " + linkedList.subList(2, 7));
		CallingLogger.getInfoLoggerFrom(className, "Peek First element from list... " + linkedList.peekFirst());
		CallingLogger.getInfoLoggerFrom(className, "Peek Last element from list... " + linkedList.peekLast());
		linkedList.remove(3);
		CallingLogger.getInfoLoggerFrom(className, "After removing index no 3 from list... " + linkedList);
	}

}