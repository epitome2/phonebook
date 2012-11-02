package com.epitome.phonebook.application.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import com.epitome.phonebook.application.ContactService;
import com.epitome.phonebook.domain.Contact;
import com.epitome.phonebook.repository.IContactRepository;

@Stateless
public class ContactServiceImpl implements ContactService {

	@Inject
	private IContactRepository contactRepository;
	public List<Contact> search(Contact aContact) {
		return contactRepository.read(aContact);
	}

	public Contact select(Contact aContact) {
		Contact contact = new Contact();
		contact.setFirstName("Amar");
		contact.setLastName("Nandigam");
		contact.setIdentity(1);
		return contact;
	}
	
	public void createNew() {
		Contact contact = new Contact();
		contact.setFirstName("Amar");
		contact.setLastName("Nandigam");
		contactRepository.persist(contact);
		
	}

	public IContactRepository getContactRepository() {
		return contactRepository;
	}

	public void setContactRepository(IContactRepository contactRepository) {
		this.contactRepository = contactRepository;
	}
	
	

}
