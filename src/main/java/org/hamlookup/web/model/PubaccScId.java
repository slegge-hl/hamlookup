/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.model;

import javax.persistence.Embeddable;

@Embeddable
public class PubaccScId implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1934190436142075933L;
		
	private String record_type;
	private int unique_system_identifier;
	private String uls_file_number;
	private String ebf_number;
	private String callsign;
	private String special_condition_type;
	private Integer special_condition_code;
	private String status_code;

	public PubaccScId() {
	}

	public PubaccScId(int uniqueSystemIdentifier) {
		this.unique_system_identifier = uniqueSystemIdentifier;
	}

	public PubaccScId(String recordType, int uniqueSystemIdentifier, String ulsFileNumber, String ebfNumber,
			String callsign, String specialConditionType, Integer specialConditionCode, String statusCode) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
		this.uls_file_number = ulsFileNumber;
		this.ebf_number = ebfNumber;
		this.callsign = callsign;
		this.special_condition_type = specialConditionType;
		this.special_condition_code = specialConditionCode;
		this.status_code = statusCode;
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

	public String getEbf_number() {
		return ebf_number;
	}

	public void setEbf_number(String ebf_number) {
		this.ebf_number = ebf_number;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public String getSpecial_condition_type() {
		return special_condition_type;
	}

	public void setSpecial_condition_type(String special_condition_type) {
		this.special_condition_type = special_condition_type;
	}

	public Integer getSpecial_condition_code() {
		return special_condition_code;
	}

	public void setSpecial_condition_code(Integer special_condition_code) {
		this.special_condition_code = special_condition_code;
	}

	public String getStatus_code() {
		return status_code;
	}

	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PubaccScId))
			return false;
		PubaccScId castOther = (PubaccScId) other;

		return ((this.getRecord_type() == castOther.getRecord_type()) || (this.getRecord_type() != null
				&& castOther.getRecord_type() != null && this.getRecord_type().equals(castOther.getRecord_type())))
				&& (this.getUnique_system_identifier() == castOther.getUnique_system_identifier())
				&& ((this.getUls_file_number() == castOther.getUls_file_number())
						|| (this.getUls_file_number() != null && castOther.getUls_file_number() != null
								&& this.getUls_file_number().equals(castOther.getUls_file_number())))
				&& ((this.getEbf_number() == castOther.getEbf_number()) || (this.getEbf_number() != null
						&& castOther.getEbf_number() != null && this.getEbf_number().equals(castOther.getEbf_number())))
				&& ((this.getCallsign() == castOther.getCallsign()) || (this.getCallsign() != null
						&& castOther.getCallsign() != null && this.getCallsign().equals(castOther.getCallsign())))
				&& ((this.getSpecial_condition_type() == castOther.getSpecial_condition_type())
						|| (this.getSpecial_condition_type() != null && castOther.getSpecial_condition_type() != null
								&& this.getSpecial_condition_type().equals(castOther.getSpecial_condition_type())))
				&& ((this.getSpecial_condition_code() == castOther.getSpecial_condition_code())
						|| (this.getSpecial_condition_code() != null && castOther.getSpecial_condition_code() != null
								&& this.getSpecial_condition_code().equals(castOther.getSpecial_condition_code())))
				&& ((this.getStatus_code() == castOther.getStatus_code()) || (this.getStatus_code() != null
						&& castOther.getStatus_code() != null && this.getStatus_code().equals(castOther.getStatus_code())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRecord_type() == null ? 0 : this.getRecord_type().hashCode());
		result = 37 * result + this.getUnique_system_identifier();
		result = 37 * result + (getUls_file_number() == null ? 0 : this.getUls_file_number().hashCode());
		result = 37 * result + (getEbf_number() == null ? 0 : this.getEbf_number().hashCode());
		result = 37 * result + (getCallsign() == null ? 0 : this.getCallsign().hashCode());
		result = 37 * result + (getSpecial_condition_type() == null ? 0 : this.getSpecial_condition_type().hashCode());
		result = 37 * result + (getSpecial_condition_code() == null ? 0 : this.getSpecial_condition_code().hashCode());
		result = 37 * result + (getStatus_code() == null ? 0 : this.getStatus_code().hashCode());
		return result;
	}

}
