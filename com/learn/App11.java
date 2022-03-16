package com.learn;

public class App11 {
	int a = 10;
	int b = 10;
	{
		System.out.println("Non static multiline initializer");
	}

	public App11() {
		System.out.println("programmer written instuction App11() construction");
	}

	public App11(int aa) {
		this();
		this.a = aa;
		System.out.println("programmer written instuction App11(int aa) construction");
	}

	public App11(int aaa, int bbb) {
		this(aaa);
		this.b = bbb;
		System.out.println("programmer written instuction App11(int aaa, int bbb) construction");

	}
	public static void main(String[] args) {
		System.out.println("main got executed");
		App11 app11=new App11(20,30);
		System.out.println(app11.a);
		System.out.println(app11.b);

	}

}
