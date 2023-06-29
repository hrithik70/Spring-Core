package com.hrithik.SpringCore.AnnotationConfig.UsingAutowireAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.hrithik.SpringCore.AnnotationConfig.UsingAutowireAnnotation")
public class PersonConfig {
	
	@Bean("person1")
	Person getPerson()
	{
		return new Person();
	}

}
