package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class AppCollecton {
	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.add(new Student(1, "Ajay"));
		arrayList.add(new Student(2, "Up macha"));
		arrayList.add(new Student(3, "Sanooj"));

		System.out.println("=========================================");

		System.out.println(arrayList);

		System.out.println("=========================================");
		// Student student = new Student();
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		System.out.println("=========================================");
		for (Object object : arrayList) {
			System.out.println(object);
		}

		System.out.println("=========================================");

		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("=========================================");

		ListIterator listIterator = arrayList.listIterator();
		//listIterator=listIterator.nextIndex(arrayList.size());
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
	}
}