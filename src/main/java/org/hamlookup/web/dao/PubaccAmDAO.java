/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccAm;

public interface PubaccAmDAO {

	public List<PubaccAm> list();
	
	public List<PubaccAm> nameTest(String name);
	
	public PubaccAm get(int id);
	
	public List<PubaccAm> idLessThan(int value);

	public List<PubaccAm> fromHd();
	
}
