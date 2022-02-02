package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * @author	Dinesh Yogi
 * @desc	Remove duplicate values of the list.
 *
 */

public class ListProgram2 {

	public static void main(String[] args) {
		Set<String> set;
		List<String> newList;
		List<String> originalList = new ArrayList<String>();
		originalList.add("A");
		originalList.add("B");
		originalList.add("C");
		originalList.add("D");
		originalList.add("A");
		originalList.add("C");
		originalList.add("E");
		originalList.add("E");
		originalList.add("E");

		// Convert list in set to remove duplicate elements
		set = new HashSet<>(originalList);

		newList = new ArrayList<String>(set);
		System.out.println(newList.toString());

	}

}