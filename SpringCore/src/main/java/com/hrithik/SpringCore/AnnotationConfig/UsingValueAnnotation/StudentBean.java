package com.hrithik.SpringCore.AnnotationConfig.UsingValueAnnotation;

import org.springframework.beans.factory.annotation.Value;

public class StudentBean {

	@Value("1")
	int id;
	@Value("Raj")
	String name;
	@Value("raj@yahoo.com")
	String email;

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
