package com.hrithik.SpringCore.DependencyInjection.ConstructorBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ComEmpMain {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ConstructorBasedConfig.xml");

		Employee emp = (Employee) context.getBean("emp1");
		System.out.println(emp);  // Employee Details : [id=11, EmpName=Ramesh, cmp=Company Details [id=1, companyName=TCS]]

		((ClassPathXmlApplicationContext) context).close();

	}

}
