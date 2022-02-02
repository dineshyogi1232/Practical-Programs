package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author	Dinesh Yogi
 * @desc	Add string values(“Hello”,”world”,”$yourname” etc.) in the list and
 *			print all the values using an iterator.
 */
public class ListProgram {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("QDev");
		list.add("Technolabs");

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
