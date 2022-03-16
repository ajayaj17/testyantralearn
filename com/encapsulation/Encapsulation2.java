package com.encapsulation;

public class Encapsulation2 {

	public static void main(String[] args) {
		Encapsulation1 e = new Encapsulation1();
		e.setHumanName("Ajay");
		e.setHumanAge(22);
		e.setHumanHeight(100);
		e.setHumanWeight(-34);
		System.out.println(e.getHumanName());
		System.out.println(e.getHumanAge());
		System.out.println(e.getHumanHeight());
		System.out.println(e.getHumanWeight());

	}

}
