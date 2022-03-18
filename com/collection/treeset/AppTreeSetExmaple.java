package com.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class AppTreeSetExmaple {

	public static void main(String[] args) {
		TreeSet<EmployeeTreeSetExample> set = new TreeSet<EmployeeTreeSetExample>();

		set.add(new EmployeeTreeSetExample(1, "ajay", 134567));
		set.add(new EmployeeTreeSetExample(2, "up", 133277));
		set.add(new EmployeeTreeSetExample(1, "ajay", 134567));
		set.add(new EmployeeTreeSetExample(3, "sanooj", 134598));

		// using comparable
		for (EmployeeTreeSetExample employeeTreeSetExample : set) {
			System.out.println(employeeTreeSetExample);
		}

		System.out.println("====================================");

		// using comparator
		Comparator<EmployeeTreeSetExample> comparator = (o1, o2) -> {
			EmployeeTreeSetExample employeeTreeSetExample1 = (EmployeeTreeSetExample) o1;
			EmployeeTreeSetExample employeeTreeSetExample2 = (EmployeeTreeSetExample) o2;
			if (employeeTreeSetExample1.getSalary() > employeeTreeSetExample2.getSalary())
				return 1;
			else if (employeeTreeSetExample1.getSalary() < employeeTreeSetExample2.getSalary())
				return -1;
			return 0;
		};

		TreeSet<EmployeeTreeSetExample> set1 = new TreeSet<EmployeeTreeSetExample>(comparator);

		set1.add(new EmployeeTreeSetExample(1, "ajay", 134567));
		set1.add(new EmployeeTreeSetExample(2, "up", 133277));
		set1.add(new EmployeeTreeSetExample(1, "ajay", 134567));
		set1.add(new EmployeeTreeSetExample(3, "sanooj", 134598));

		for (EmployeeTreeSetExample employeeTreeSetExample3 : set1) {
			System.out.println(employeeTreeSetExample3);
		}

		System.out.println("====================================");

	}

}
