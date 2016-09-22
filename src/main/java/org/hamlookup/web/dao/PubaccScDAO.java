/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccSc;

public interface PubaccScDAO {

	public List<PubaccSc> list();
	

	public List<PubaccSc> get(int id);
	
	public List<PubaccSc> idLessThan(int value);

	
}