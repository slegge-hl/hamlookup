/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.model;
// Generated Sep 10, 2016 11:53:33 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Embeddable;

/**
 * PubaccHsId generated by hbm2java
 */
@Embeddable
public class PubaccHsId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 78594270890L;
	
	private String record_type;
	private int unique_system_identifier;
	private String uls_file_number;
	private String callsign;
	private String log_date;
	private String code;

	public PubaccHsId() {
	}

	public PubaccHsId(String recordType, int uniqueSystemIdentifier) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
	}

	public PubaccHsId(String recordType, int uniqueSystemIdentifier, String ulsFileNumber, String callsign,
			String logDate, String code) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
		this.uls_file_number = ulsFileNumber;
		this.callsign = callsign;
		this.log_date = logDate;
		this.code = code;
	}
	
	
	
	public String getRecord_type() {
		return record_type;
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public int getUnique_system_identifier() {
		return unique_system_identifier;
	}

	public void setUnique_system_identifier(int unique_system_identifier) {
		this.unique_system_identifier = unique_system_identifier;
	}

	public String getUls_file_number() {
		return uls_file_number;
	}

	public void setUls_file_number(String uls_file_number) {
		this.uls_file_number = uls_file_number;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public String getLog_date() {
		return log_date;
	}

	public void setLog_date(String log_date) {
		this.log_date = log_date;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PubaccHsId))
			return false;
		PubaccHsId castOther = (PubaccHsId) other;

		return ((this.getRecord_type() == castOther.getRecord_type()) || (this.getRecord_type() != null
				&& castOther.getRecord_type() != null && this.getRecord_type().equals(castOther.getRecord_type())))
				&& (this.getUnique_system_identifier() == castOther.getUnique_system_identifier())
				&& ((this.getUls_file_number() == castOther.getUls_file_number())
						|| (this.getUls_file_number() != null && castOther.getUls_file_number() != null
								&& this.getUls_file_number().equals(castOther.getUls_file_number())))
				&& ((this.getCallsign() == castOther.getCallsign()) || (this.getCallsign() != null
						&& castOther.getCallsign() != null && this.getCallsign().equals(castOther.getCallsign())))
				&& ((this.getLog_date() == castOther.getLog_date()) || (this.getLog_date() != null
						&& castOther.getLog_date() != null && this.getLog_date().equals(castOther.getLog_date())))
				&& ((this.getCode() == castOther.getCode()) || (this.getCode() != null && castOther.getCode() != null
						&& this.getCode().equals(castOther.getCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRecord_type() == null ? 0 : this.getRecord_type().hashCode());
		result = 37 * result + this.getUnique_system_identifier();
		result = 37 * result + (getUls_file_number() == null ? 0 : this.getUls_file_number().hashCode());
		result = 37 * result + (getCallsign() == null ? 0 : this.getCallsign().hashCode());
		result = 37 * result + (getLog_date() == null ? 0 : this.getLog_date().hashCode());
		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		return result;
	}

}