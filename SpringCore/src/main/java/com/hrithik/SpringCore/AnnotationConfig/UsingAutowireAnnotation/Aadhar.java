package com.hrithik.SpringCore.AnnotationConfig.UsingAutowireAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Aadhar {

	@Value("45695678")
	long aadharId;
	@Value("05-06-2012")
	String date_of_issue;

	@Override
	public String toString() {
		return "Aadhar [aadharId=" + aadharId + ", date_of_issue=" + date_of_issue + "]";
	}

}
