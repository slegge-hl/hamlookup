/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PubaccDAO {

	public SessionFactory sessionFactory;
	
	public PubaccDAO() {
		
	}
	
	public PubaccDAO(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	 
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	 
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
