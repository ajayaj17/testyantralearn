package com.assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, fact = 1;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the no. you want to get factorial of :");
		n = s.nextInt();
		for (int i = n; i > 0; i--) {
			fact *= i;
		}
		System.out.println("factorial of " + n + " is : " + fact);

	}

}
