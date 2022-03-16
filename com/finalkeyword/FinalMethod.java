package com.finalkeyword;

class A {
	public final void abc() {
		System.out.println("print");
	}

	public final void abc(String a) {
		System.out.println(a);
	}
}

class B extends A {
//	@Override
//	public final void abc() {		//cannot be override
//		System.out.println("print 1");
//	}
}

public class FinalMethod {

	public static void main(String[] args) {
		B b= new B();
		b.abc();
		b.abc("aaa");

	}

}
