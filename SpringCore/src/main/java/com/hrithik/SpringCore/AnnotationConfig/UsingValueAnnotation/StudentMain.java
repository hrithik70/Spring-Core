package com.hrithik.SpringCore.AnnotationConfig.UsingValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		StudentBean student = (StudentBean) context.getBean("Student1");
		System.out.println(student);

		((AnnotationConfigApplicationContext) context).close();

	}

}
