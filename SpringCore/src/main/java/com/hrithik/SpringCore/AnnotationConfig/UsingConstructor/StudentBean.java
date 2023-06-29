package com.hrithik.SpringCore.AnnotationConfig.UsingConstructor;

public class StudentBean {

	int id;
	String name;
	String email;

	public StudentBean(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentBean Details : [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
