/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccLa;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccLaDAOImpl extends PubaccDAO implements PubaccLaDAO {
	
	@Override
	@Transactional
	public List<PubaccLa> list() {
	
		@SuppressWarnings("unchecked")
		List<PubaccLa> listPubaccLa = (List<PubaccLa>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccLa.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccLa;
	}

	@Override
	@Transactional
	public List<PubaccLa> get(int id) {
		
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccLa> listPubaccLa =  session.createCriteria(PubaccLa.class)
                .add(Restrictions.eq("id.unique_system_identifier", id))  
                .list();  
				
		return listPubaccLa;
	}

	
	@Override
	@Transactional
	public List<PubaccLa> idLessThan(int value) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccLa> list = session.createCriteria(PubaccLa.class).list();  

		return list; 

	}
	
}