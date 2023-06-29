package com.hrithik.SpringCore.DependencyInjection.ConstructorBased;

public class Company {

	int id;
	String companyName;

	public Company(int id, String companyName) {
		this.id = id;
		this.companyName = companyName;
	}

	public Company() {

	}

	@Override
	public String toString() {
		return " Company Details [id=" + id + ", companyName=" + companyName + "]";
	}

}
