package com.abstraction.interfaces.comparables;
import java.util.Arrays;
import java.util.Comparator;

public class AppEmployee1 {

	public static void main(String[] args) {
		Employee[] e = { new Employee(23, "Ajay", 10000), new Employee(22, "Abhinav", 20000),
				new Employee(19, "Uvapriya", 15000) };

		Comparator cc = (o1, o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.geteAge() > e2.geteAge())
				return 1;
			else if (e1.geteAge() < e2.geteAge())
				return -1;
			return 0;
		};
		Comparator cc1 = (o1, o2) -> {
			Employee e1 = (Employee) o1;
			Employee e2 = (Employee) o2;
			if (e1.geteSalary() > e2.geteSalary())
				return 1;
			else if (e1.geteSalary() < e2.geteSalary())
				return -1;
			return 0;
		};
		Arrays.sort(e, cc);
		for (Employee employee : e) {
			System.out.println(employee);
		}
	}
}
