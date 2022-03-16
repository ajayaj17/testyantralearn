package com.multithreading;

public class AppReadWrite {

	public static void main(String[] args) {
		Thread thread3 = new Thread(new WriteThread());
		Thread thread5 = new Thread(new ReadThread());
		thread3.start();
		thread5.start();
	}

}
