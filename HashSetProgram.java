package com.collection;

import java.util.HashSet;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate Of HashSet Program
 */
public class HashSetProgram {

	public static void main(String[] args) {
		int size = 10;
		String className = "HashSetProgram";
		HashSet<Integer> hashSet = new HashSet<>();
		for (int count = 0; count <= size; count++) {
			hashSet.add(count);
		}
		CallingLogger.getInfoLoggerFrom(className, hashSet.toString());
		CallingLogger.getInfoLoggerFrom(className, "Size of set... " + hashSet.size());
		CallingLogger.getInfoLoggerFrom(className, "Check set is empty or not... " + hashSet.isEmpty());
		CallingLogger.getInfoLoggerFrom(className,
				"After remove all element using removeAll() it return true or false... " + hashSet);
		hashSet.add(1);
		CallingLogger.getInfoLoggerFrom(className, hashSet.toString());
		hashSet.clear();
		CallingLogger.getInfoLoggerFrom(className, "After clear the set... " + hashSet);
	}

}