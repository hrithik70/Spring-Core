package com.hrithik.SpringCore.DependencyInjection.SettersGetters;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ChildFatherMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("SettersGetterConfig.xml");
		Child hrithik = (Child) context.getBean("hrithik");
		System.out.println(hrithik);

		Child Raju = (Child) context.getBean("Raju");
		System.out.println(Raju);

		((ClassPathXmlApplicationContext) context).close();

	}

}
