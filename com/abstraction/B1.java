package com.abstraction;

public class B1 extends A1 {
	B1() {
		super("A1()");
		System.out.println("this is no argumented constructor B1()");
	}

	B1(String a) {
		this();
		System.out.println("this is argumented " + a + " constructor");

	}

	static {
		System.out.println("this is static multiline initialier in B1");
	}
	{
		System.out.println("this is non-static multiline initializer in B1");
	}

	@Override
	public void met() {
		System.out.println("this is abstract method Defination");
	}

}
