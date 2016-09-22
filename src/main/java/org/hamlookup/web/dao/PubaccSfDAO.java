/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;


import java.util.List;

import org.hamlookup.web.model.PubaccSf;

public interface PubaccSfDAO {

	public List<PubaccSf> list();
	

	public PubaccSf get(int id);
	
	public List<PubaccSf> idLessThan(int value);

	
}
