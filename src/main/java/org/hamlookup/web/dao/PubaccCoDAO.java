/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccCo;

public interface PubaccCoDAO {

	public List<PubaccCo> list();
	

	public List<PubaccCo> get(int id);
	
	public List<PubaccCo> idLessThan(int value);

	
}