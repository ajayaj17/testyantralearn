package com.abstraction;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Claculation cc = new Claculation();

		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value");
		int a = s.nextInt();
		System.out.println("enter the second value");
		int b = s.nextInt();
		System.out.println("enter your choice \n 1.add \n2.sub \n3.mul");
		int d = s.nextInt();
		switch (d) {
		case 1:
			cc.add(a, b);
			break;
		case 2:
			cc.sub(a, b);
			break;
		case 3:
			cc.mul(a, b);
			break;
		default:
			break;
		}
	}
}
