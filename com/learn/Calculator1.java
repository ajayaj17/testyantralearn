package com.learn;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean exit_ = false;
		do {
			System.out.println(
					"enter the no.\n 1. for additon\n 2. for subtraction\n 3. for multiplication\n 4.for division\n 5. for exit\n");

			int k = s.nextInt();
			System.out.println("enter the first value :");
			int a = s.nextInt();
			System.out.println("enter the second value :");
			int b = s.nextInt();
			switch (k) {
			case 1:
				System.out.println(Calculator.add(a, b));
				break;
			case 2:
				System.out.println(Calculator.sub(a, b));
				break;
			case 3:
				System.out.println(Calculator.mul(a, b));
				break;
			case 4:
				if (b != 0)
					System.out.println(Calculator.div(a, b));
				else
					System.out.println("can not divide by 0");
				break;
			case 5:
				exit_ = true;
				break;
			default:
				System.out.println("enter valid no.");
				break;
			}
		} while (!exit_);
	}

}
