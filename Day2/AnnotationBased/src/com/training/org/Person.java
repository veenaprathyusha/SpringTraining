package com.training.org;

import org.springframework.beans.factory.annotation.Required;

public class Person {
	
	private String personName;
	private int personAge;
	
	
	public String getPersonName() {
		return personName;
	}
	@Required
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	
	@Required
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	
	
	

}

