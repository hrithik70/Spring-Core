package com.hrithik.SpringCore.AnnotationConfig.UsingAutowireAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PersonAadharMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfig.class);
		Person p1 = (Person) context.getBean("person1");
		System.out.println(p1);  // Person [id=1, name=Hrithik, aadhar=Aadhar [aadharId=45695678, date_of_issue=05-06-2012]]

		((AnnotationConfigApplicationContext) context).close();

	}

}
