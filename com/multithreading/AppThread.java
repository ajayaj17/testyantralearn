package com.multithreading;

public class AppThread {

	public static void main(String[] args) {
		CharThread charThread= new CharThread();
		IntegerThread integerThread= new IntegerThread();
		integerThread.start();
		charThread.start();
		
//		charThread.run();				
//		integerThread.run();			//Act as single thread
	}

}
