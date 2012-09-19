package com.epitome.phonebook.application.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.epitome.phonebook.application.ContactService;
import com.epitome.phonebook.domain.Contact;

@Stateless
public class ContactServiceImpl implements ContactService {

	public List<Contact> search(Contact aContact) {
		List<Contact> contacts = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setFirstName("Amar");
		contact.setLastName("Nandigam");
		contact.setIdentity(1);
		contacts.add(contact);
		return contacts;
	}

	public Contact select(Contact aContact) {
		Contact contact = new Contact();
		contact.setFirstName("Amar");
		contact.setLastName("Nandigam");
		contact.setIdentity(1);
		
		return contact;
	}

}
