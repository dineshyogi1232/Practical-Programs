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
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			linkedList1.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, "" + linkedList1);
		CallingLogger.getInfoLoggerFrom(className, "Add element from head... " + linkedList1.offerFirst(-1));
		CallingLogger.getInfoLoggerFrom(className, "" + linkedList1);
		CallingLogger.getInfoLoggerFrom(className, "Add element from tail... " + linkedList1.offerLast(11));
		CallingLogger.getInfoLoggerFrom(className, "" + linkedList1);
		CallingLogger.getInfoLoggerFrom(className, "Remove element using pop()... " + linkedList1.pop());
		linkedList1.add(3, 12);
		CallingLogger.getInfoLoggerFrom(className, "Add element at index no 3... " + linkedList1);
		CallingLogger.getInfoLoggerFrom(className, "Getting element using index no... " + linkedList1.get(4));
		CallingLogger.getInfoLoggerFrom(className, "Sublist... " + linkedList1.subList(2, 7));
		CallingLogger.getInfoLoggerFrom(className, "Peek First element from list... " + linkedList1.peekFirst());
		CallingLogger.getInfoLoggerFrom(className, "Peek Last element from list... " + linkedList1.peekLast());
		linkedList1.remove(3);
		CallingLogger.getInfoLoggerFrom(className, "After removing index no 3 from list... " + linkedList1);
	}

}