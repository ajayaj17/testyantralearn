package com.multithreading;

public class AppRunnable {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new CharRunnable());
		Thread thread2 = new Thread(new IntegerRunnable());
		thread1.start();
		thread2.start();
	}
}
