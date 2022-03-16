package com.finalkeyword;

public class Person {
	final Address add = new Address();

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Person {" + add + "}";
	}

	@Override
	public boolean equals(Object a) {
		Person p=(Person) a;
		Person p1= new Person();
		if(p1.getAdd().equals(p.getAdd()))
			return true;
		return false;
	}
	@Override
	public int hashCode() {
		int res=2;
		res= res*add.hashCode();
		return res;
		
	}

}
