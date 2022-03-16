package com.abstraction.interfaces;

public interface I01 {
	int a=01;
	static void m1() {
		System.out.println("static method "+a);
	}
	default void m2() {
		System.out.println("default method  1");
	}
}
