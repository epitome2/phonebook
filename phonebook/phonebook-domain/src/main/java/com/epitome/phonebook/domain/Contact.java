package com.epitome.phonebook.domain;

public class Contact implements IEntity<Integer> {
	private Integer identity;
	private String firstName;
	private String lastName;
	
	public Integer getIdentity() {
		return identity;
	}
	
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
