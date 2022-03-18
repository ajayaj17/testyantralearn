package com.java8feature.function.function;

import java.lang.reflect.Array;
import java.util.function.Function;

public class AppFunction {

	public static void main(String[] args) {
		Function<Integer, Integer> function = i -> i * i;
		System.out.println(function.apply(5));

		System.out.println("==============================================");

		Function<String, Boolean> function2 = string -> {
			String s = "";

			for (int i = string.length() - 1; i >= 0; i--) {
				s = s + string.charAt(i);
				System.out.println(s);
			}
			if (string.equalsIgnoreCase(s))
				return true;
			return false;
		};
		String str = "malayalam";
		System.out.println(function2.apply(str));

	}

}
