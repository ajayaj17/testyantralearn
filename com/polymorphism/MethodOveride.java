package com.polymorphism;

public class MethodOveride {
public static void main(String[] args) {
	MethodOverideMiui m= new MethodOverideMiui();
	MethodOverideOxygenOS o=new MethodOverideOxygenOS();
	System.out.println("miui");
	m.runOS();
	m.security();
	System.out.println("oxygen");
	o.runOS();
	o.security();
}
}
