package com.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import com.oopsconcepts.CallingLogger;

/**
 * @author	Dinesh Yogi
 * @desc	Program Using Map and Set concepts
 */
public class MapAndSet {

	public static void main(String[] args) {
		String className = "MapAndSet";
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(2);

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "A");
		map.put(4, "D");
		map.put(5, "E");

		Iterator<Integer> iterator1 = set.iterator();
		CallingLogger.getInfoLoggerFrom(className, "Set Element List: ");
		while (iterator1.hasNext()) {
			CallingLogger.getInfoLoggerFrom(className, iterator1.next().toString());
		}
		Iterator<String> iterator2 = map.values().iterator();
		CallingLogger.getInfoLoggerFrom(className, "Map Element List: ");
		while (iterator2.hasNext()) {
			CallingLogger.getInfoLoggerFrom(className,iterator2.next());
		}
	}

}