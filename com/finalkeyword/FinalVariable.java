package com.finalkeyword;

public class FinalVariable {

	final int a = 10;  // can not be changed
	final int b;

	public FinalVariable() {
		b = 20;
		
	}

	public static void main(String[] args) {
		FinalVariable f = new FinalVariable();
		System.out.println(f.a);
		System.out.println(f.b);
	}

}
