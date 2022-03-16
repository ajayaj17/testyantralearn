package com.abstraction.interfaces.comparables;

import java.util.Arrays;

public class AppEmployee {
	public static void main(String[] args) {
		Employee[] e= {new Employee(23,"Ajay",10000),new Employee(22,"Abhinav",20000),new Employee(19,"Uvapriya",15000)};
		Arrays.sort(e,new CompareEmployeeBasedOnAge());
		for (Employee employee : e) {
			System.out.println(employee);
		}
	}
}
