package com.hrithik.SpringCore.DependencyInjectionCollection.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CountryStateMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("setCollectionConfig.xml");
		Country country = (Country) context.getBean("country");
		System.out.println(country);    // Country(countryCode=91, name=India,
										// states=[States(stateId=5, name=Maharastra, population=8965745),
										// States(stateId=4, name=Karnataka, population=4965745),
										// States(stateId=3, name=Tamil Nadu, population=6965745)])

		((ClassPathXmlApplicationContext) context).close();
	}

}
