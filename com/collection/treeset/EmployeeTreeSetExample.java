package com.collection.treeset;

public class EmployeeTreeSetExample implements Comparable {
	private int eid;
	private String eName;
	private long Salary;

	public EmployeeTreeSetExample() {
		super();
	}

	public EmployeeTreeSetExample(int eid, String eName, long salary) {
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
		return " EmployeeTreeSetExample [eid=" + eid + ", eName=" + eName + ", Salary=" + Salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (Salary ^ (Salary >>> 32));
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + eid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeTreeSetExample other = (EmployeeTreeSetExample) obj;
		if (Salary != other.Salary)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (eid != other.eid)
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		EmployeeTreeSetExample employeeTreeSetExample = (EmployeeTreeSetExample) o;
		if (this.eid > employeeTreeSetExample.eid)
			return 1;
		else if (this.eid < employeeTreeSetExample.eid)
			return -1;
		return 0;
	}

}
