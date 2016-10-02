/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccHs;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccHsDAOImpl extends PubaccDAO implements PubaccHsDAO {
	
	@Override
	@Transactional
	public List<PubaccHs> list() {
		@SuppressWarnings("unchecked")
		List<PubaccHs> listPubaccHs = (List<PubaccHs>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccHs.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccHs;
	}

	@Override
	@Transactional
	public List<PubaccHs> get(int id) {	
		
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
	    List<PubaccHs> listPubaccHs =  session.createCriteria(PubaccHs.class)
                .add(Restrictions.eq("id.unique_system_identifier", id))  
                .list();  
		
				
		return listPubaccHs;
	}

	@Override
	@Transactional
	public List<PubaccHs> idLessThan(int value) {
		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
	    List<PubaccHs> list = session.createCriteria(PubaccHs.class).list();  

		return list; 

	}
	
	@Override
	@Transactional
	public List<PubaccHs> nameTest(String name) {
		Session session = sessionFactory.getCurrentSession();
	
		@SuppressWarnings("unchecked")
	    List<PubaccHs> list =  session.createCriteria(PubaccHs.class)
                .add(Restrictions.eq("certifier_last_name", name))  
                .list();  
				
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccHs> fromHs() {
		
		Session session = sessionFactory.getCurrentSession();	
		
		Query query = session.createQuery("from PubaccHs");
        query.setFirstResult(0);
        query.setMaxResults(20);

    	@SuppressWarnings("unchecked")
        List<PubaccHs> result = query.list();
        
    	return result;
	}

}
