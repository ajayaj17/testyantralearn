package com.abstraction.interfaces.comparables;

public class Student implements Comparable {
	private int sAge;
	private String sName;

	public Student() {
		super();
	}

	public Student(int sAge, String sName) {
		super();
		this.sAge = sAge;
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "Student [sAge=" + sAge + ", sName=" + sName + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		if (this.sAge > s.sAge) {

			return 1;
		} else if (this.sAge < s.sAge)
			return -1;
		return 0;
	}

}
