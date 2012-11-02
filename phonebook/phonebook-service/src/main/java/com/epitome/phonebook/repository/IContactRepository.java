package com.epitome.phonebook.repository;

import java.util.List;

import com.epitome.phonebook.domain.Contact;

public interface IContactRepository {
	public List<Contact> read(String query, String[] params);
	public Contact persist(Contact contact);
	public List<Contact> read(Contact contact);
	public void delete(Contact contact);
}
