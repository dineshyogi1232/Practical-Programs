package org.collection;

import java.util.LinkedHashSet;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of LinkedHashSet Program
 */
public class LinkedHashSetProgram {

	public static void main(String[] args) {
		int size = 10;
		String className = "LinkedHashSetProgram";
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		for (int count = 0; count <= size; count++) {
			linkedHashSet.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, "" + linkedHashSet);
		CallingLogger.getInfoLoggerFrom(className, "Check set is empty or not... " + linkedHashSet.isEmpty());
		CallingLogger.getInfoLoggerFrom(className, "Check Size of set... " + linkedHashSet.size());
		CallingLogger.getInfoLoggerFrom(className,
				"Remove element from set it returns true or false... " + linkedHashSet.remove(1));
		CallingLogger.getInfoLoggerFrom(className, "" + linkedHashSet);
		linkedHashSet.clear();
		CallingLogger.getInfoLoggerFrom(className, "After clear the set using clear()... " + linkedHashSet);
	}

}