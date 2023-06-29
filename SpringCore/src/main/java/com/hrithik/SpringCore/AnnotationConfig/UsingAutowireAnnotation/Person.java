package com.hrithik.SpringCore.AnnotationConfig.UsingAutowireAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Person {

	@Value("1")
	int id;
	@Value("Hrithik")
	String name;
	@Autowired
	Aadhar aadhar;

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", aadhar=" + aadhar + "]";
	}

}
