package com.collection;

import java.util.LinkedHashSet;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Of LinkedHashSet Program
 */
public class LinkedHashSetProgram {

	public static void main(String[] args) {
		int size = 10;
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int count = 0; count <= size; count++) {
			linkedHashSet.add(count);
		}
		System.out.println(linkedHashSet);
		System.out.println("Check set is empty or not... " + linkedHashSet.isEmpty());
		System.out.println("Check Size of set... " + linkedHashSet.size());
		System.out.println("Remove element from set it returns true or false... " + linkedHashSet.remove(1));
		System.out.println(linkedHashSet);
		linkedHashSet.clear();
		System.out.println("After clear the set using clear()... " + linkedHashSet);
	}

}