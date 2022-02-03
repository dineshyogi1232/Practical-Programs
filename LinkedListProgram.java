package com.Collection;

import java.util.LinkedList;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of LinkedListProgram Program
 */
public class LinkedListProgram {

	public static void main(String[] args) {
		int size = 10;
		LinkedList<Integer> linkedList1 = new LinkedList<>();
		for (int count = 0; count <= size; count++) {
			linkedList1.add(count);
		}
		System.out.println(linkedList1);
		System.out.println("Add element from head... " + linkedList1.offerFirst(-1));
		System.out.println(linkedList1);
		System.out.println("Add element from tail... " + linkedList1.offerLast(11));
		System.out.println(linkedList1);
		System.out.println("Remove element using pop()... " + linkedList1.pop());
		linkedList1.add(3, 12);
		System.out.println("Add element at index no 3... " + linkedList1);
		System.out.println("Getting element using index no... " + linkedList1.get(4));
		System.out.println("Sublist... " + linkedList1.subList(2, 7));
		System.out.println("Peek First element from list... " + linkedList1.peekFirst());
		System.out.println("Peek Lasst element from list... " + linkedList1.peekLast());
		linkedList1.remove(3);
		System.out.println("After removing index no 3 from list... " + linkedList1);
	}

}