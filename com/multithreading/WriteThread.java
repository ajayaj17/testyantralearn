package com.multithreading;

public class WriteThread implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < MyStory.s.length(); i++) {
			MyStory.s.replace(i, i + 1, "--");
		}

	}

}
