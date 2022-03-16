package com.assignment;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter the maximum no. to pirint");
		int n= s.nextInt();
		for(int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
	

	}

}
