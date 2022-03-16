package com.multithreading;

public class CharRunnable implements Runnable {
	@Override
	public void run() {
		for (char c = 'a'; c < 'z'; c++) {
			System.out.println("char   " + c);
		}
	}

}