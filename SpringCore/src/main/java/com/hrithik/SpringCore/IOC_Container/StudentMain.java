package com.hrithik.SpringCore.IOC_Container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("studentConfig.xml");
		StudentPOJO student = (StudentPOJO) context.getBean("student");
		student.setName("Hrithik Raj");
		System.out.println(student);
		
		
		((ClassPathXmlApplicationContext) context).close();

	}

}
