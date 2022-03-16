package com.abstraction;

public class Claculation extends AbstractClass {

	@Override
	public void add(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}

	@Override
	public void sub(int a, int b) {
		int c = a - b;
		System.out.println(c);
	}

}
