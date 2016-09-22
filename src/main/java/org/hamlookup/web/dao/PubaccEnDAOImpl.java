/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccEn;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccEnDAOImpl implements PubaccEnDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public PubaccEnDAOImpl() {
		
	}
	
	public PubaccEnDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<PubaccEn> list() {
		@SuppressWarnings("unchecked")
		List<PubaccEn> listPubaccEn = (List<PubaccEn>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccEn.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccEn;
	}

	@Override
	@Transactional
	public PubaccEn get(int id) {
		
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccEn> listPubaccEn =  session.createCriteria(PubaccEn.class)
                .add(Restrictions.eq("unique_system_identifier", id))  
                .list();  
		
		if (listPubaccEn != null && !listPubaccEn.isEmpty()) {
			return listPubaccEn.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<PubaccEn> idLessThan(int value) {

		System.out.println(" in idLessThan, value=" + value);

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccEn> list = session.createCriteria(PubaccEn.class).list();  

		return list; 

	}
	
	@Override
	@Transactional
	public List<PubaccEn> nameTest(String name) {
		
		Session session = sessionFactory.getCurrentSession();
	
		@SuppressWarnings("unchecked")
	    List<PubaccEn> list =  session.createCriteria(PubaccEn.class)
                .add(Restrictions.eq("certifier_last_name", name))  
                .list();  
		
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccEn> fromHd() {
		
		Session session = sessionFactory.getCurrentSession();	
		
		Query query = session.createQuery("from PubaccEn");
        query.setFirstResult(0);
        query.setMaxResults(20);

    	@SuppressWarnings("unchecked")
        List<PubaccEn> result = query.list();
        
		return result;
	}

}
