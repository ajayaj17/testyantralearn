package com.assignment;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no. to check prime no :");
		n = s.nextInt();
		for (int i = 2; i < n - 1; i++) {
			if (n % i == 0) {
				System.out.println("Not a prime no.");
				break;
			}
			else {
				System.out.println("It is a prime no.");
				break;
			}

		}
	}

}
