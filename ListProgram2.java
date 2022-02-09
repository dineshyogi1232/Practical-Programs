package com.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Remove duplicate values of the list.
 */
public class ListProgram2 {

	public static void main(String[] args) {
		List<String> originalList = new ArrayList<>();
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
		Set<String> set = new HashSet<>(originalList);

		List<String> newList = new ArrayList<>(set);
		CallingLogger.getInfoLoggerFrom("ListProgram2", "" + newList.toString());
	}

}