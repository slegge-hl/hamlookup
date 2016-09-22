/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccCo;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccCoDAOImpl implements PubaccCoDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public PubaccCoDAOImpl() {
		
	}
	
	public PubaccCoDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<PubaccCo> list() {
	
		@SuppressWarnings("unchecked")
		List<PubaccCo> listPubaccCo = (List<PubaccCo>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccCo.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccCo;
	}

	@Override
	@Transactional
	public List<PubaccCo> get(int id) {
		
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccCo> listPubaccCo =  session.createCriteria(PubaccCo.class)
                .add(Restrictions.eq("id.unique_system_identifier", id))  
                .list();  
		
		return listPubaccCo;
	}

	
	@Override
	@Transactional
	public List<PubaccCo> idLessThan(int value) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccCo> list = session.createCriteria(PubaccCo.class).list();  

		return list; 

	}
	
}