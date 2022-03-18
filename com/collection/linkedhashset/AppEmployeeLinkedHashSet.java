package com.collection.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class AppEmployeeLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<EmployeeLinkedHashSetExample> linkedHashSet = new LinkedHashSet<EmployeeLinkedHashSetExample>();
		linkedHashSet.add(new EmployeeLinkedHashSetExample(1, "ajay", 20000l));
		linkedHashSet.add(new EmployeeLinkedHashSetExample(2, "up macha", 30000l));
		linkedHashSet.add(new EmployeeLinkedHashSetExample(3, "sanooj", 20000l));
		linkedHashSet.add(new EmployeeLinkedHashSetExample(2, "up macha", 30000l));

		Iterator<EmployeeLinkedHashSetExample> iterator = linkedHashSet.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
