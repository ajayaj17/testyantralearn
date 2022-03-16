package com.learn;

public class App10 {
	// Non-static variable= Non-static singe line initializer
	int a=10;
	int b=10;
	
	//Non-static multiline initializer
	{
		System.out.println("Non-static got executed");
	}
	
	public App10(){
		// 1.Non-static members will get loaded in the object
		//(Loading variabes with default values + method references)
		// 2. Non-static initializer will get executed
		//3. Programmer written instruction get executed
		System.out.println("Programmer written instruction");
	}

	public static void main(String[] args) {
		System.out.println("main got executed");
		App10 app10 = new App10();

	}

}
