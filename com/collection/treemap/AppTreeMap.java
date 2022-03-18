package com.collection.treemap;

import java.util.TreeMap;
import java.util.Comparator;
import java.util.Map;

public class AppTreeMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		treeMap.put(1, "ajay");
		treeMap.put(2, "up");
		treeMap.put(2, "up macha");
		treeMap.put(3, "sanooj");

		for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());

		}
		System.out.println("========================");
		System.out.println("sorting in descending");
		Comparator comparator = (o1, o2) -> {
			Integer integer1 = (Integer) o1;
			Integer integer2 = (Integer) o2;
			if (integer1 > integer2)
				return -1;
			else if (integer1 < integer2)
				return 1;
			return 0;
		};

		TreeMap<Integer, String> treeMap1 = new TreeMap<Integer, String>(comparator);

		treeMap1.put(1, "ajay");
		treeMap1.put(2, "up");
		treeMap1.put(2, "up macha");
		treeMap1.put(3, "sanooj");

		for (Map.Entry<Integer, String> entry : treeMap1.entrySet()) {
			System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());

		}

	}
}
