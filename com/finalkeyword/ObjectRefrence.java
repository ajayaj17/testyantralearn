package com.finalkeyword;

public class ObjectRefrence {

	public static void main(String[] args) {
		Person p=new Person();
		Person p1 = new Person();
		p.getAdd().setCity("banglore");
		p.getAdd().setState("Karnataka");
		System.out.println(p.getAdd().getCity());
		System.out.println(p.getAdd().getState());
		System.out.println("====================");
		p1.getAdd().setCity("banglore");
		p1.getAdd().setState("Karnataka");
		System.out.println(p);
		System.out.println(p.equals(p1));
		
	}

}
