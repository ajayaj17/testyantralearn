package com.polymorphism;

class Parent {
	public static void name() {
		System.out.println("parent");
	}

}

class Child extends Parent {
	public static void name() {
		System.out.println("child");
	}
}

public class MethodShadowing {

	public static void main(String[] args) {

		Parent p = new Child();
		p.name();
		Child c = (Child) p;
		c.name();
	}

}
