package com.hrithik.SpringCore.BeanScope.Singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SingletonScopeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("singletonScopeConfig.xml");
		StudentPOJO student = (StudentPOJO) context.getBean("student");
		student.setId(1);
		student.setName("Hrithik");
		student.setSalary(456.55);
		System.out.println(student); // StudentPOJO(id=1, name=Hrithik, salary=456.55)

		StudentPOJO student1 = (StudentPOJO) context.getBean("student");
		System.out.println(student1); // StudentPOJO(id=1, name=Hrithik, salary=456.55)

		((ClassPathXmlApplicationContext) context).close();

	}

}
