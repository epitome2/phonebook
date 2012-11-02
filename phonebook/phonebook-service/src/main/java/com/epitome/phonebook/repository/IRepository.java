package com.epitome.phonebook.repository;

import java.util.List;

public interface IRepository<T> {
	public List<T> read(String query, String[] params);
	public T persist(T entity);
	public void delete(T entity);
}
