package com.collection.hashset;

import java.util.HashSet;

public class AppHashSet {
public static void main(String[] args) {
	HashSet<Integer> hashSet= new HashSet<Integer>();
	hashSet.add(5);
	hashSet.add(6);
	hashSet.add(5);
	hashSet.add(7);
	hashSet.add(5);
	hashSet.add(2);
	hashSet.add(9);
	hashSet.add(6);
	
	for (Integer integer : hashSet) {
		System.out.println(integer);
	}
}
}
