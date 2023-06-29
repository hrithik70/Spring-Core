package com.hrithik.SpringCore.DependencyInjection.ConstructorBased;

public class Employee {

	int id;
	String EmpName;
	Company cmp;

	public Employee(int id, String empName, Company cmp) {
		super();
		this.id = id;
		this.EmpName = empName;
		this.cmp = cmp;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee Details : [id=" + id + ", EmpName=" + EmpName + ", cmp=" + cmp + "]";
	}

}
