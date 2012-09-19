package com.epitome.phonebook.web;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.epitome.phonebook.application.ContactService;
import com.epitome.phonebook.domain.Contact;

@Named
@RequestScoped
public class ContactListBacking {
	private static Logger log = LoggerFactory.getLogger(ContactListBacking.class);
	@Inject
	private ContactService contactService;

	private Contact searchCriteria = new Contact();
	private List<Contact> searchResult = new ArrayList<Contact>();

	@Produces
	@Named
	@RequestScoped
	public Contact getSearchCriteria() {
		return searchCriteria;
	}
	
	@Produces
	@Named
	@RequestScoped
	public List<Contact> getSearchResult() {
		return searchResult;
	}

	public String processContactSearch() {
		contactService.search(searchCriteria);
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
