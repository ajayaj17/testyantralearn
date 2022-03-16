package com.multithreading;

public class IntegerRunnable implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println("integer   " + i);
		}
	}

}
