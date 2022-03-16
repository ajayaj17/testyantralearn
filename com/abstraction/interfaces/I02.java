package com.abstraction.interfaces;

public interface I02 {
	int b=2;
	static void m1() {
		System.out.println("static method "+b);
	}
	default void m2() {
		System.out.println("default method 2");
	}

}
