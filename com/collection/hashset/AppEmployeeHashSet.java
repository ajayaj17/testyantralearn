package com.collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class AppEmployeeHashSet {
	public static void main(String[] args) {
		HashSet<EmployeeHashSetExample> hashSet = new HashSet<EmployeeHashSetExample>();
		hashSet.add(new EmployeeHashSetExample(1, "ajay", 20000l));
		hashSet.add(new EmployeeHashSetExample(2, "up macha", 30000l));
		hashSet.add(new EmployeeHashSetExample(3, "sanooj", 20000l));
		hashSet.add(new EmployeeHashSetExample(2, "up macha", 30000l));

		Iterator<EmployeeHashSetExample> iterator = hashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
