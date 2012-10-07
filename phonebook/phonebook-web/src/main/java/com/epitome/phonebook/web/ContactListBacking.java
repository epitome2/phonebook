package com.epitome.phonebook.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epitome.phonebook.application.ContactService;
import com.epitome.phonebook.domain.Contact;

@Named("clb")
@RequestScoped
public class ContactListBacking {
	private static Logger log = LoggerFactory.getLogger(ContactListBacking.class);
	
	@Inject
	private ContactService contactService;

	private Contact searchCriteria = new Contact();
	private List<Contact> searchResult = new ArrayList<Contact>();

	public Contact getSearchCriteria() {
		return searchCriteria;
	}
	
	
	public List<Contact> getSearchResult() {
		return searchResult;
	}

	public String getMessage() {
		return "Hello CDI!";
	}
	
	public String processContactSearch() {
		log.debug("Processing contactSearch");
		//searchResult = contactService.search(searchCriteria);
		List<Contact> contacts = new ArrayList<Contact>();
		Contact contact = new Contact();
		contact.setFirstName("Amar");
		contact.setLastName("Nandigam");
		contact.setIdentity(1);
		contacts.add(contact);
		searchResult = contacts;
		return null;
	}

	public void setSearchCriteria(Contact searchCriteria) {
		this.searchCriteria = searchCriteria;
	}

	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
	}

	public void setSearchResult(List<Contact> searchResult) {
		this.searchResult = searchResult;
	}
	
	
	

}
