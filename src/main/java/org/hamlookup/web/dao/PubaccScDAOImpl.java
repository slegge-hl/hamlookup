/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccSc;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccScDAOImpl implements PubaccScDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public PubaccScDAOImpl() {
		
	}
	
	public PubaccScDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<PubaccSc> list() {
	
		@SuppressWarnings("unchecked")
		List<PubaccSc> listPubaccSc = (List<PubaccSc>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccSc.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccSc;
	}

	@Override
	@Transactional
	public List<PubaccSc> get(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
	    List<PubaccSc> listPubaccSc =  session.createCriteria(PubaccSc.class)
                .add(Restrictions.eq("id.unique_system_identifier", id))  
                .list();  
		
		
		return listPubaccSc;
	}

	
	@Override
	@Transactional
	public List<PubaccSc> idLessThan(int value) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccSc> list = session.createCriteria(PubaccSc.class).list();  

		return list; 

	}
	
}