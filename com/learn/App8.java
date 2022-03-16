package com.learn;

public class App8 {
	static {
		System.out.println("static got executed");
		App8 app8 = new App8();
		int a = app8.returnmeInt();
		System.out.println("value received " + a);
	}

	// static method
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed");
	}

	public int returnmeInt() {
		return 10;
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed");
		demoStaticMethod();
		//app8.demoNonStaticMethod();

	}

}
