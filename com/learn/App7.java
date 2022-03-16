package com.learn;

public class App7 {
	//static variable= static single line initializer
	static int a=10;	//1st
	
	//static method
	public static void demoStaticMethod() {
		System.out.println("demoStaticMethod() method got executed");
	}
	
	public void demoNonStaticMethod() {
		System.out.println("demoNonStaticMethod() method got executed");
		
	}
	
	//static multi-line initilizer
	static {
		System.out.println("static got executed");
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method got executed");
		demoStaticMethod();
		App7 app7= new App7();
		app7.demoNonStaticMethod();

	}

}
