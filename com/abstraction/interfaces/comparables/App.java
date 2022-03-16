package com.abstraction.interfaces.comparables;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		Student[] sArray= {new Student(19,"Ajay"), new Student(22,"Bibash"),new Student(21,"Rephael"),new Student(23,"Jhon")};
		Arrays.sort(sArray);
		for (Student student : sArray) {
			System.out.println(student);
		}

	}

}
