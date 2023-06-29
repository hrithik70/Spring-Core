package com.hrithik.SpringCore.DependencyInjectionCollection.List;

import java.util.List;

import lombok.Data;

@Data
public class TataMotors {
	
	int id;
	String companyName;
	List<Cars> Cars;

}
