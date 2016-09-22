/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccAm;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccAmDAOImpl implements PubaccAmDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public PubaccAmDAOImpl() {
		
	}
	
	public PubaccAmDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<PubaccAm> list() {
		@SuppressWarnings("unchecked")
		List<PubaccAm> listPubaccAm = (List<PubaccAm>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccAm.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccAm;
	}

	@Override
	@Transactional
	public PubaccAm get(int id) {

		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<PubaccAm> listPubaccAm =  session.createCriteria(PubaccAm.class)
                .add(Restrictions.eq("unique_system_identifier", id))  
                .list();  
		
		if (listPubaccAm != null && !listPubaccAm.isEmpty()) {
			return listPubaccAm.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<PubaccAm> idLessThan(int value) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccAm> list = session.createCriteria(PubaccAm.class).list();  

		return list; 

	}
	
	@Override
	@Transactional
	public List<PubaccAm> nameTest(String name) {

		Session session = sessionFactory.getCurrentSession();
	
		@SuppressWarnings("unchecked")
	    List<PubaccAm> list =  session.createCriteria(PubaccAm.class)
                .add(Restrictions.eq("certifier_last_name", name))  
                .list();  
		
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccAm> fromHd() {
		
		Session session = sessionFactory.getCurrentSession();	
		
		Query query = session.createQuery("from PubaccAm");
        query.setFirstResult(0);
        query.setMaxResults(20);

    	@SuppressWarnings("unchecked")
        List<PubaccAm> result = query.list();
        
		return result;
	}

}
