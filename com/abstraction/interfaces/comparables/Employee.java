package com.abstraction.interfaces.comparables;

public final class Employee {
	private int eAge;
	private String eName;
	private int eSalary;
	public Employee() {
		super();
	}

	public Employee(int eAge, String eName, int eSalary) {
		super();
		this.eAge = eAge;
		this.eName = eName;
		this.eSalary = eSalary;
	}

	public int geteAge() {
		return eAge;
	}
	public void seteAge(int eAge) {
		this.eAge = eAge;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
		
	}
	public int geteSalary() {
		return eSalary;
	}
	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}
	@Override
	public String toString() {
		return "EmployeeLinkedHashSetExample [eAge=" + eAge + ", eName=" + eName + ", eSalary=" + eSalary + "]";
	}

	
}
