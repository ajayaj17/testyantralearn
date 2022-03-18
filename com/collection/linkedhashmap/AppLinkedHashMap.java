package com.collection.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AppLinkedHashMap {
	public static void main(String[] args) {

		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, "ajay");
		linkedHashMap.put(2, "up");
		linkedHashMap.put(2, "up macha");
		linkedHashMap.put(3, "sanooj");

		for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
		}

		System.out.println("=======================================");

		for (Map.Entry<Integer, String> entry1 : linkedHashMap.entrySet()) {
			System.out.println(linkedHashMap.get(entry1.getKey()));
		
		}
	}
}
