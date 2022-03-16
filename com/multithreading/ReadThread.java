package com.multithreading;

public class ReadThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < MyStory.s.length(); i++) {
			System.out.print(MyStory.s.charAt(i));
		}

	}
}
