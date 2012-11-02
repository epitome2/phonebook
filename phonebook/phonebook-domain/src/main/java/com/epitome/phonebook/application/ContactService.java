package com.epitome.phonebook.application;

import java.util.List;

import com.epitome.phonebook.domain.Contact;

public interface ContactService {
	public List<Contact> search(Contact contact);
	
	public Contact select(Contact contact);
	
	public void createNew();

}
