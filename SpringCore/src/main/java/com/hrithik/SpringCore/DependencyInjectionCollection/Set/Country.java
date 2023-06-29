package com.hrithik.SpringCore.DependencyInjectionCollection.Set;

import java.util.Set;

import lombok.Data;

@Data
public class Country {
	
	int countryCode;
	String name;
	Set<States> states;

}
