package com.epitome.phonebook.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact implements IEntity<Integer> {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
