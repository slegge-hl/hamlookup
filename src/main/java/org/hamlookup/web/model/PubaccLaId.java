/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.model;

import javax.persistence.Embeddable;

@Embeddable
public class PubaccLaId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6825063337524634670L;
	
	private String record_type;
	private Integer unique_system_identifier;
	private String callsign;
	private Character attachment_code;
	private String attachment_desc;
	private String attachment_date;
	private String attachment_filename;
	private Character action_performed;

	public PubaccLaId() {
	}

	public PubaccLaId(String recordType, Integer uniqueSystemIdentifier, String callsign, Character attachmentCode,
			String attachmentDesc, String attachmentDate, String attachmentFilename, Character actionPerformed) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
		this.callsign = callsign;
		this.attachment_code = attachmentCode;
		this.attachment_desc = attachmentDesc;
		this.attachment_date = attachmentDate;
		this.attachment_filename = attachmentFilename;
		this.action_performed = actionPerformed;
	}

	public String getRecord_type() {
		return record_type;
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public Integer getUnique_system_identifier() {
		return unique_system_identifier;
	}

	public void setUnique_system_identifier(Integer unique_system_identifier) {
		this.unique_system_identifier = unique_system_identifier;
	}

	public String getCallsign() {
		return callsign;
	}

	public void setCallsign(String callsign) {
		this.callsign = callsign;
	}

	public Character getAttachment_code() {
		return attachment_code;
	}

	public void setAttachment_code(Character attachment_code) {
		this.attachment_code = attachment_code;
	}

	public String getAttachment_desc() {
		return attachment_desc;
	}

	public void setAttachment_desc(String attachment_desc) {
		this.attachment_desc = attachment_desc;
	}

	public String getAttachment_date() {
		return attachment_date;
	}

	public void setAttachment_date(String attachment_date) {
		this.attachment_date = attachment_date;
	}

	public String getAttachment_filename() {
		return attachment_filename;
	}

	public void setAttachment_filename(String attachment_filename) {
		this.attachment_filename = attachment_filename;
	}

	public Character getAction_performed() {
		return action_performed;
	}

	public void setAction_performed(Character action_performed) {
		this.action_performed = action_performed;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PubaccLaId))
			return false;
		PubaccLaId castOther = (PubaccLaId) other;

		return ((this.getRecord_type() == castOther.getRecord_type()) || (this.getRecord_type() != null
				&& castOther.getRecord_type() != null && this.getRecord_type().equals(castOther.getRecord_type())))
				&& ((this.getUnique_system_identifier() == castOther.getUnique_system_identifier())
						|| (this.getUnique_system_identifier() != null && castOther.getUnique_system_identifier() != null
								&& this.getUnique_system_identifier().equals(castOther.getUnique_system_identifier())))
				&& ((this.getCallsign() == castOther.getCallsign()) || (this.getCallsign() != null
						&& castOther.getCallsign() != null && this.getCallsign().equals(castOther.getCallsign())))
				&& ((this.getAttachment_code() == castOther.getAttachment_code())
						|| (this.getAttachment_code() != null && castOther.getAttachment_code() != null
								&& this.getAttachment_code().equals(castOther.getAttachment_code())))
				&& ((this.getAttachment_desc() == castOther.getAttachment_desc())
						|| (this.getAttachment_desc() != null && castOther.getAttachment_desc() != null
								&& this.getAttachment_desc().equals(castOther.getAttachment_desc())))
				&& ((this.getAttachment_date() == castOther.getAttachment_date())
						|| (this.getAttachment_date() != null && castOther.getAttachment_date() != null
								&& this.getAttachment_date().equals(castOther.getAttachment_date())))
				&& ((this.getAttachment_filename() == castOther.getAttachment_filename())
						|| (this.getAttachment_filename() != null && castOther.getAttachment_filename() != null
								&& this.getAttachment_filename().equals(castOther.getAttachment_filename())))
				&& ((this.getAction_performed() == castOther.getAction_performed())
						|| (this.getAction_performed() != null && castOther.getAction_performed() != null
								&& this.getAction_performed().equals(castOther.getAction_performed())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRecord_type() == null ? 0 : this.getRecord_type().hashCode());
		result = 37 * result + (getUnique_system_identifier() == null ? 0 : this.getUnique_system_identifier().hashCode());
		result = 37 * result + (getCallsign() == null ? 0 : this.getCallsign().hashCode());
		result = 37 * result + (getAttachment_code() == null ? 0 : this.getAttachment_code().hashCode());
		result = 37 * result + (getAttachment_desc() == null ? 0 : this.getAttachment_desc().hashCode());
		result = 37 * result + (getAttachment_date() == null ? 0 : this.getAttachment_date().hashCode());
		result = 37 * result + (getAttachment_filename() == null ? 0 : this.getAttachment_filename().hashCode());
		result = 37 * result + (getAction_performed() == null ? 0 : this.getAction_performed().hashCode());
		return result;
	}

}
