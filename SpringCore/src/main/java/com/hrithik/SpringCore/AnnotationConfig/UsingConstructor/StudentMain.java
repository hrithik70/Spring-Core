package com.hrithik.SpringCore.AnnotationConfig.UsingConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean s1 = (StudentBean) context.getBean("Student1");
		System.out.println(s1);

		((AnnotationConfigApplicationContext) context).close();

	}

}
