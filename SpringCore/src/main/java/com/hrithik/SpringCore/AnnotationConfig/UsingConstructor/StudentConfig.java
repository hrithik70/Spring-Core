package com.hrithik.SpringCore.AnnotationConfig.UsingConstructor;

import org.springframework.context.annotation.Bean;

public class StudentConfig {

	@Bean("Student1")
	public StudentBean getStudent() {
		return new StudentBean(1,"Hrithik","hrithik@gmail.com");
	}

}
