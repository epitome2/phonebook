package com.epitome.phonebook.repository.impl;

import java.util.List;

import com.epitome.phonebook.domain.Contact;
import com.epitome.phonebook.repository.IContactRepository;

public class ContactRepositoryImpl extends JPARepositoryImpl<Contact> implements IContactRepository{

	
	public ContactRepositoryImpl() {
		super(Contact.class);
	}

	public List<Contact> read(Contact contact) {
		String[] params = {};
		return super.read("SELECT c FROM Contact c", params);
	}

}
