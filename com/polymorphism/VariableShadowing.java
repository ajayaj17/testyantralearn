package com.polymorphism;
class Paren {
int a=10;
}

class Chil extends Paren {
	int a=20;
	}


public class VariableShadowing {

	public static void main(String[] args) {
		Chil c= new Chil();
		System.out.println(c.a);
	}

}
