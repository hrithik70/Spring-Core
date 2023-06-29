package com.hrithik.SpringCore.BeanScope.Prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentPrototypeMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("prototypeScopeConfig.xml");
		StudentPOJO student1 = (StudentPOJO) context.getBean("student");
		student1.setId(1);
		student1.setName("Hrithik");
		System.out.println(student1); // StudentPOJO(id=1, name=Hrithik)

		StudentPOJO student2 = (StudentPOJO) context.getBean("student");
		student2.setId(2);
		System.out.println(student2); // StudentPOJO(id=2, name=null)
		((ClassPathXmlApplicationContext) context).close();
	}

}
