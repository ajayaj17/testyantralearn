package com.learn;

public class App9 {

	// Non-static variable= Non-static single line initializer
	int a = 10; // 1st

	// Non-static multiline initializer
	{
		// 2nd
		System.out.println("Non-static got executed");
	}

	// Non-static method
	public void demoNonstaticMethod() {
		System.out.println("Non-static method got executed");
	}

	public static void main(String[] args) {
		System.out.println("main method got executed");
		System.out.println("creating an object");
		App9 app9 = new App9();
		System.out.println("End");
	}

}
