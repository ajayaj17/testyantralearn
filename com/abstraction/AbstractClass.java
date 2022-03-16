package com.abstraction;

public abstract class AbstractClass {
	public abstract void add(int a, int b);

	public abstract void sub(int a, int b);

	public void mul(int a, int b) {
		int c = a * b;
		System.out.println(c);
	}
}
