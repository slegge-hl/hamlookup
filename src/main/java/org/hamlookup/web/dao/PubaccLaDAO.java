/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.dao;

import java.util.List;

import org.hamlookup.web.model.PubaccLa;

public interface PubaccLaDAO {

	public List<PubaccLa> list();
	
	public List<PubaccLa> get(int id);
	
	public List<PubaccLa> idLessThan(int value);

	
}