/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Generated Sep 10, 2016 11:53:33 PM by Hibernate Tools 3.4.0.CR1

/**
 * PubaccSc generated by hbm2java
 */
@Entity
@Table(name = "PUBACC_SC")
public class PubaccSc implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2311929712973607464L;
	
	@Id
	private PubaccScId id;

	public PubaccScId getId() {
		return this.id;
	}

	public void setId(PubaccScId id) {
		this.id = id;
	}

}