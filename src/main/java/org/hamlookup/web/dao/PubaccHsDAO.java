/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccHs;

public interface PubaccHsDAO {

	public List<PubaccHs> list();
	
	public List<PubaccHs> nameTest(String name);
	
	public List<PubaccHs> get(int id);
	
	public List<PubaccHs> idLessThan(int value);

	public List<PubaccHs> fromHs();
	
}
