package com.abstraction;

public abstract class A1 {
	A1() {
		System.out.println("no arguement constructor A1()");
	}

	A1(String a) {
		this();
		System.out.println("this is arguemented " + a+" constructor");
	}

	static {
		System.out.println("this is static multi line initializeer in A1");
	}
	{
		System.out.println("this is non static initializer in A2");
	}

	public abstract void met();
}
