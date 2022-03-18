package com.assignment;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class FindSecondMaxMin {

	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no .of elements you want to insert");
		int n = s.nextInt();
		int m;
		System.out.println("enter your elements");
		for (int i = 0; i < n; i++) {
			m = s.nextInt();
			set.add(m);
		}
		System.out.println(set);
				System.out.println("second min is : " + set.higher(set.first()));

		System.out.println("second max is : " + set.lower(set.last()));

	}

}
