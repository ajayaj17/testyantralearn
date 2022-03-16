package com.exception;

import java.util.Scanner;

public class Agecheck {
	private int age;

	public Agecheck() {
		super();
	}

	public Agecheck(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Agecheck [age=" + age + "]";
	}
	
		
	}

