package com.Collection;

import java.util.HashSet;

/**
 * @author	Dinesh Yogi
 * @desc	Demonstrate of HashSet Program
 */
public class HashSetProgram {

	public static void main(String[] args) {
		int size = 10;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int count = 0; count <= size; count++) {
			hashSet.add(count);
		}
		System.out.println(hashSet);
		System.out.println("Size of set... " + hashSet.size());
		System.out.println("Check set is empty or not... " + hashSet.isEmpty());
		System.out.println(hashSet.removeAll(hashSet));
		System.out.println("After remove all element using removeAll() it return true or false... " + hashSet);
		hashSet.add(1);
		System.out.println(hashSet);
		hashSet.clear();
		System.out.println("After clear the set... " + hashSet);
	}

}