package com.inheritance;

public class InstanceOfOPerator {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();

		boolean r = b instanceof A;
		boolean r1 = a instanceof B;
		boolean r2 = a instanceof Object;
		System.out.println("is parent ? " + r);
		System.out.println("is child ?" + r1);
		System.out.println("is object ?" + r2);
	}

}
