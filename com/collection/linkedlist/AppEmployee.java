package com.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class AppEmployee {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Employee(1, "ajay", 20000l));
		list.add(new Employee(2, "up macha", 30000l));
		list.add(new Employee(3, "sanooj", 20000l));
		list.add(new Employee(4, "abhinav", 30000l));

		ListIterator iterator = list.listIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("============================");
		//list.remove(3);
		
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}	
			
			

	}
}
