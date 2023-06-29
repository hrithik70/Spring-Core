package com.hrithik.SpringCore.DependencyInjectionCollection.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AddressMapMain {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("mapCollectionConfig.xml");
		Address address = (Address) context.getBean("address");
		System.out.println(address); // Address(id=1, 
									//	addressMap={
												//	1=Pune, 
												//  2=Bangalore, 
												//  3=Noida, 
												//  4=Hyderabad
		                                        //  })

		((ClassPathXmlApplicationContext) context).close();

	}

}
