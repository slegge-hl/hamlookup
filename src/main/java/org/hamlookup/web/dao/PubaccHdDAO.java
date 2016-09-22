/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccHd;

public interface PubaccHdDAO {

	public List<PubaccHd> list();
	
	public List<PubaccHd> nameTest(String name);
	
	public PubaccHd get(int id);
	
	public void saveOrUpdate(PubaccHd agentConfig);
	
	public void delete(int id);

	public List<PubaccHd> idLessThan(int value);

	public List<PubaccHd> fromHd();

	public List<PubaccHd> firstName(String name);

	public List<PubaccHd> firstAndLast(String first, String last);
	
	public List<PubaccHd> findHam(PubaccHd hdRec);
	
}
