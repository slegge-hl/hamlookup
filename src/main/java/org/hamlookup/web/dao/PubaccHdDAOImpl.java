/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccHd;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class PubaccHdDAOImpl extends PubaccDAO implements PubaccHdDAO {
	
	@Override
	@Transactional
	public List<PubaccHd> list() {
		@SuppressWarnings("unchecked")
		List<PubaccHd> listPubaccHd = (List<PubaccHd>) sessionFactory.getCurrentSession()
				.createCriteria(PubaccHd.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();

		return listPubaccHd;
	}

	@Override
	@Transactional
	public void saveOrUpdate(PubaccHd agentConfig) {
		sessionFactory.getCurrentSession().saveOrUpdate(agentConfig);
	}

	@Override
	@Transactional
	public void delete(int id) {
		PubaccHd agentConfigToDelete = new PubaccHd();
		sessionFactory.getCurrentSession().delete(agentConfigToDelete);
	}

	@Override
	@Transactional
	public PubaccHd get(int id) {
		String hql = "from PubaccHd where id=" + id;
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		
		@SuppressWarnings("unchecked")
		List<PubaccHd> listPubaccHd = (List<PubaccHd>) query.list();
		
		if (listPubaccHd != null && !listPubaccHd.isEmpty()) {
			return listPubaccHd.get(0);
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<PubaccHd> idLessThan(int value) {
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccHd> list = (List<PubaccHd>) session.createCriteria(PubaccHd.class).list();  

		return list; 

	}
	
	@Override
	@Transactional
	public List<PubaccHd> nameTest(String name) {

		Session session = sessionFactory.getCurrentSession();
	
		@SuppressWarnings("unchecked")
	    List<PubaccHd> list =  session.createCriteria(PubaccHd.class)
                .add(Restrictions.eq("certifier_last_name", name))  
                .list();  
				
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccHd> fromHd() {
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from PubaccHd");
        query.setFirstResult(0);
        query.setMaxResults(20);

    	@SuppressWarnings("unchecked")
        List<PubaccHd> result = query.list();
        
		return result;
	}

	@Override
	@Transactional
	public List<PubaccHd> firstName(String name) {
		
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccHd> list =  session.createCriteria(PubaccHd.class)
                .add(Restrictions.eq("certifier_first_name", name))  
                .list();  
		
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccHd> firstAndLast(String first, String last) {

		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
	    List<PubaccHd> list =  session.createCriteria(PubaccHd.class)
                .add(Restrictions.eq("certifier_first_name", first))
                .add(Restrictions.eq("certifier_last_name", last))  
                .list();  
		
		return list; 
		
	}

	@Override
	@Transactional
	public List<PubaccHd> findHam(PubaccHd hdRec) {
		Session session = sessionFactory.getCurrentSession();
		//Session session = sessionFactory.openSession();
		
		Criteria findCrit = session.createCriteria(PubaccHd.class);
		
		String callSign = hdRec.getCall_sign(); 
		if(callSign != null && callSign.length() > 0)
			findCrit.add(Restrictions.eq("call_sign", callSign));
		
		String lastName = hdRec.getCertifier_last_name();
		if(lastName != null && lastName.length() > 0)
			findCrit.add(Restrictions.eq("certifier_last_name", lastName));
		
		String firstName = hdRec.getCertifier_first_name();
		if(firstName != null && firstName.length() > 0)
			findCrit.add(Restrictions.eq("certifier_first_name", firstName));

		int uid = hdRec.getUnique_system_identifier();
		if(uid > 0)
			findCrit.add(Restrictions.eq("unique_system_identifier", uid));
		
		@SuppressWarnings("unchecked")
		List<PubaccHd> list = findCrit.list();
				
		return list; 
	}
	
}
