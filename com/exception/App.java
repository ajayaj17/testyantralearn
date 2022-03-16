package com.exception;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Agecheck a= new Agecheck();
		System.out.println("enter yor age");
		int age=s.nextInt();
		a.setAge(age);
		if(age<1)
			throw new customException("value entered is negative");
		else
			System.out.println(a);
	}
}
