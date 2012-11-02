package com.epitome.phonebook.repository.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.epitome.phonebook.repository.IRepository;

public class JPARepositoryImpl<T> implements IRepository<T> {

	@PersistenceContext(unitName="phonebook")
	EntityManager em;
	
	protected Class<T> entityClass;
	public JPARepositoryImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public List<T> read(String strQuery, String[] params) {
		TypedQuery<T> query = em.createQuery(strQuery, entityClass);
		int i=0;
		for(String param: params) {
			query.setParameter(i++, param);
		}
		return query.getResultList();
	}
	
	public T persist(T entity) {
		em.persist(entity);
		return entity;
	}

	public void delete(T entity) {
		em.remove(entity);
		
	}
	
}
