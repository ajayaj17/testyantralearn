package com.java8feature.function.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AppPredicate {

	public static void main(String[] args) {
		Predicate<Integer> predicate = (Integer a) -> {
			for (int i = 2; i < a; i++)
				if (a % i == 0)
					return false;
			return true;
		};

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no.");
		int n = s.nextInt();
		System.out.println("Is Prime  " + predicate.test(n));

		// alternative method
		// This is Anonymonous class

		Predicate<Integer> predicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				if (t % 2 == 0)
					return true;
				return false;
			}
		};

		System.out.println("==================================================");
		System.out.println("Is even " + predicate2.test(n));

		// alternative method for lamda

		Predicate<Integer> predicate3 = i -> i % 3 == 0;

		System.out.println("==================================================");

		System.out.println("is multiple of 3 " + predicate3.test(n));
		System.out.println("==================================================");
		Predicate<String> predicate4 = string -> string.length() > 5;
		System.out.println("is length > 5  " + predicate4.test("ajay"));
	}

}
