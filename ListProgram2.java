package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author	Dinesh Yogi
 * @desc	Remove Duplicate values of the list.
 */
public class ListProgram2 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		list1.add("A");
		list1.add("C");
		list1.add("E");
		list1.add("E");
		list1.add("E");

		// Convert list in set to remove duplicate elements
		Set<String> set = new HashSet<>(list1);
		List<String> list2 = new ArrayList<>(set);
		System.out.println(list2);
	}

}