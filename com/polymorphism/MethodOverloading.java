package com.polymorphism;

class Paret1 {
	public void name() {
		System.out.println("parent");

	}

	public void name(int a) {
		System.out.println(a);

	}

	public void name(double a) {
		System.out.println(a);

	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		Paret1 p = new Paret1();
		p.name();
		p.name(10);
		p.name(12.12001);
	}

}
