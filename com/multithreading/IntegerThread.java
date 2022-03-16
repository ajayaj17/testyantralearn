package com.multithreading;

public class IntegerThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("integer   " + i);
		}
	}
}
