package com.inheritance;

public class C extends B {
	private int e = 50;
	private int f = 60;

	public C() {
		super();
	}

	public C(int e, int f) {
		super();
		this.e = e;
		this.f = f;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}

}
