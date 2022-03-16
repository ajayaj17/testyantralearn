package com.assignment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int a = 0, b = 1, sum = 0, n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no of series to print");
		n = s.nextInt();
		System.out.println(a+"\n"+ b);
		for (int i = 0; i < n - 2; i++) {
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}
	}
}
