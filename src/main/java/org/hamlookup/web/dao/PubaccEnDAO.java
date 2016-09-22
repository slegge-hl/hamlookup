/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccEn;

public interface PubaccEnDAO {

	public List<PubaccEn> list();
	
	public List<PubaccEn> nameTest(String name);
	
	public PubaccEn get(int id);
	
	public List<PubaccEn> idLessThan(int value);

	public List<PubaccEn> fromHd();
	
}
