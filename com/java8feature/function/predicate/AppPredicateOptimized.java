package com.java8feature.function.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AppPredicateOptimized {

	public static void main(String[] args) {
		Predicate<Employee> predicate = e -> e.getEid() <= 5;
		
		ArrayList<Employee> arrayList= new ArrayList<Employee>();
		arrayList.add(new Employee(1,"ajay",10000));
		arrayList.add(new Employee(2,"up",10300));
		arrayList.add(new Employee(3,"sanooj",10060));
		arrayList.add(new Employee(6,"abhi",10200));
		
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
		System.out.println("==========================================");
		
		ArrayList<Employee> res= new ArrayList<Employee>();
		for (Employee employee : arrayList) {
			res.add(employee);
		}
		System.out.println(res);
		
		System.out.println("===========================================");
		
		res=(ArrayList<Employee>) arrayList.stream().filter(predicate).collect(Collectors.toList());
		
		System.out.println(res);
		
		Employee employee= new Employee();
		System.out.println("===========================================");
		res=(ArrayList<Employee>) arrayList.stream().filter(e -> e.getEid() <= 5).collect(Collectors.toList());
	System.out.println(res);
	}

}
