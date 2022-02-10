package com.collection;

import java.util.LinkedList;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Of LinkedListProgram Program
 */
public class LinkedListProgram {

	public static void main(String[] args) {
		int size = 10;
		LinkedList<Integer> linkedList = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			linkedList.add(count);
		}
		System.out.println(linkedList);
		System.out.println("Add element from head... " + linkedList.offerFirst(-1));
		System.out.println(linkedList);
		System.out.println("Add element from tail... " + linkedList.offerLast(11));
		linkedList.add(3, 12);
		System.out.println("Add element at index no 3... " + linkedList);
		System.out.println(linkedList);

		System.out.println("Sublist... " + linkedList.subList(2, 7));
		System.out.println("Peek First element from list... " + linkedList.peekFirst());
		System.out.println("Peek Last element from list... " + linkedList.peekLast());
		System.out.println("Getting element using index no... " + linkedList.get(4));

		System.out.println("Remove element using pop()... " + linkedList.pop());
		linkedList.remove(3);
		System.out.println("After removing index no 3 from list... " + linkedList);
	}

}