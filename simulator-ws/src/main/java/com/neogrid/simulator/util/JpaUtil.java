package com.neogrid.simulator.util;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class JpaUtil {
	
	private EntityManagerFactory factory;
	private EntityManager manager;

	public JpaUtil() {
		factory = Persistence.createEntityManagerFactory("simulator-unit");
		manager = factory.createEntityManager();
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> findAll(final String query) {
		return manager.createQuery(query).getResultList();
	}
	
	public Object find(final String query) {
		return manager.createQuery(query).getSingleResult();
	}
	
	public Object findByParams(final String queryString, Parameter... parameters) {
		Object object;
		
		List<Object> resultList = findAllByParams(queryString, parameters);
		
		if(resultList.isEmpty()){
			object = null;
		} else {
			object = resultList.get(0);
		}
		
		return object;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> findAllByParams(final String queryString, Parameter... parameters) {
		Query query = manager.createQuery(queryString);
		
		for(Parameter parameter : parameters) {
			query.setParameter(parameter.getKey(), parameter.getValue());
		}
		
		return query.getResultList();
	}
	
}
