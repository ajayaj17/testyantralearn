package com.inheritance;

public class SingleMain {

	public static void main(String[] args) {
		B B = new B();
		System.out.println(B.getA());
		System.out.println(B.getB());
		System.out.println(B.getC());
		System.out.println(B.getD());

		System.out.println("===============");
		A a = new B(); // Upcasting

		System.out.println(a.getA());
		System.out.println(a.getB());
//		System.out.println(a.getC());
//		System.out.println(a.getD());

		System.out.println("===============");

//		B ss1 = new A();		//Downcasting //ClassCastException
//		System.out.println(bb.getA());
//		System.out.println(bb.getB());
//		System.out.println(bb.getC());
//		System.out.println(bb.getD());

		System.out.println("===============");

		A ss = new B(); // Upcasting
		B bbb = (B) ss; // Downcasting => B bbb = new B();
		System.out.println(bbb.getA());
		System.out.println(bbb.getB());
		System.out.println(bbb.getC());
		System.out.println(bbb.getD());

		System.out.println("===============");

		C cc = new C();
		System.out.println(cc.getA());
		System.out.println(cc.getB());
		System.out.println(cc.getC());
		System.out.println(cc.getD());
		System.out.println(cc.getE());
		System.out.println(cc.getF());

		System.out.println("===============");

		A aaaa = new B();
		C c = (C) aaaa;
		System.out.println(c.getA());
		System.out.println(c.getB());
		System.out.println(c.getC());
		System.out.println(c.getD());
		System.out.println(c.getE());
		System.out.println(c.getF());

	}

}
