package com.hrithik.SpringCore.DependencyInjectionCollection.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarsMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("listCollectionConfig.xml");
		TataMotors company = (TataMotors) context.getBean("company");
		System.out.println(company);    // TataMotors(id=1, companyName=Tata, Cars=[Cars(carId=123, model=Tata Nano,
										// price=300000.0),
										// Cars(carId=183, model=Tata Safari, price=900000.0),
										// Cars(carId=173, model=Tata Nexon, price=500000.0)])

		((ClassPathXmlApplicationContext) context).close();
	}

}
