/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccSf;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccSfDAOImpl extends PubaccDAO implements PubaccSfDAO {
	
	@Override
	@Transactional
	public List<PubaccSf> list() {
		@SuppressWarnings("unchecked")
		List<PubaccSf> listPubaccSf = (List<PubaccSf>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccSf.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccSf;
	}

	@Override
	@Transactional
	public PubaccSf get(int id) {

		Session session = sessionFactory.getCurrentSession();
		
		@SuppressWarnings("unchecked")
		List<PubaccSf> listPubaccSf =  session.createCriteria(PubaccSf.class)
                .add(Restrictions.eq("unique_system_identifier", id))  
                .list();  
		
		if (listPubaccSf != null && !listPubaccSf.isEmpty()) {
			return listPubaccSf.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<PubaccSf> idLessThan(int value) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccSf> list = session.createCriteria(PubaccSf.class).list();  

		return list; 

	}


}
