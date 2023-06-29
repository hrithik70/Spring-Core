package com.hrithik.SpringCore.AnnotationConfig.UsingValueAnnotation;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	@Bean("Student1")
	public StudentBean getStudent()
	{
		return new StudentBean();
	}

}
