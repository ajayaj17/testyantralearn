package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class AppHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(1, "ajay");
		hashMap.put(2, "up");
		hashMap.put(2, "up macha");
		hashMap.put(3, "sanooj");

		for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
		}
	}
}
