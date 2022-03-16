package com.collection.linkedlist;

public class Employee {
	private int eid;
	private String eName;
	private long Salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String eName, long salary) {
		super();
		this.eid = eid;
		this.eName = eName;
		Salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public long getSalary() {
		return Salary;
	}

	public void setSalary(long salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", eName=" + eName + ", Salary=" + Salary + "]";
	}

}
