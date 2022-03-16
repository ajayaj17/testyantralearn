package com.assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int n, l, r, c, n1;
		double arm = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the no to find");
		n = s.nextInt();
		n1 = n;
//		String n2= Integer.toString(n1);
//		l=n2.length();
		l = String.valueOf(n1).length();
		while (n != 0) {
			r = n % 10;
			arm += Math.pow(r, l);
			n /= 10;
		}
		if (arm == n1) {
			System.out.println("it is armstrong");
		} else {
			System.out.println("Not a armstrong");
		}
	}

}
