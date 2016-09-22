/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.model;
// Generated Sep 9, 2016 10:51:19 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * PubaccHdId generated by hbm2java
 */
@Entity
@Table(name = "PUBACC_HD")
public class PubaccHd implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9217165997113311180L;

	private String record_type;

	@Id
	private int unique_system_identifier;

	private String uls_file_number;
	private String ebf_number;
	private String call_sign;
	
	private String license_status;
	private String radio_service_code;
	private String grant_date;
	private String expired_date;
	private String cancellation_date;
	private String eligibility_rule_num;
	private String applicant_type_code_reserved;
	private String alien;
	private String alien_government;
	private String alien_corporation;
	private String alien_officer;
	private String alien_control;
	private String revoked;
	private String convicted;
	private String adjudged;
	private String involved_reserved;
	private String common_carrier;
	private String non_common_carrier;
	private String private_comm;
	private String fixed;
	private String mobile;
	private String radiolocation;
	private String satellite;
	private String developmental_or_sta;
	private String interconnected_service;
	private String certifier_first_name;
	private String certifier_mi;
	private String certifier_last_name;
	private String certifier_suffix;
	private String certifier_title;
	private String gender;
	private String african_american;
	private String native_american;
	private String hawaiian;
	private String asian;
	private String white;
	private String ethnicity;
	private String effective_date;
	private String last_action_date;
	private Integer auction_id;
	private String reg_stat_broad_serv;
	private String band_manager;
	private String type_serv_broad_serv;
	private String alien_ruling;
	private String licensee_name_change;

	public PubaccHd() {
	}

	public PubaccHd(String recordType, int uniqueSystemIdentifier) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
	}

	public PubaccHd(String recordType, int uniqueSystemIdentifier, String ulsFileNumber, String ebfNumber,
			String callSign, String licenseStatus, String radioServiceCode, String grantDate, String expiredDate,
			String cancellationDate, String eligibilityRuleNum, String applicantTypeCodeReserved, String alien,
			String alienGovernment, String alienCorporation, String alienOfficer, String alienControl,
			String revoked, String convicted, String adjudged, String involvedReserved,
			String commonCarrier, String nonCommonCarrier, String privateComm, String fixed,
			String mobile, String radiolocation, String satellite, String developmentalOrSta,
			String interconnectedService, String certifierFirstName, String certifierMi, String certifierLastName,
			String certifierSuffix, String certifierTitle, String gender, String africanAmerican,
			String nativeAmerican, String hawaiian, String asian, String white, String ethnicity,
			String effectiveDate, String lastActionDate, Integer auctionId, String regStatBroadServ,
			String bandManager, String typeServBroadServ, String alienRuling, String licenseeNameChange) {
		this.record_type = recordType;
		this.unique_system_identifier = uniqueSystemIdentifier;
		this.uls_file_number = ulsFileNumber;
		this.ebf_number = ebfNumber;
		this.call_sign = callSign;
		this.license_status = licenseStatus;
		this.radio_service_code = radioServiceCode;
		this.grant_date = grantDate;
		this.expired_date = expiredDate;
		this.cancellation_date = cancellationDate;
		this.eligibility_rule_num = eligibilityRuleNum;
		this.applicant_type_code_reserved = applicantTypeCodeReserved;
		this.alien = alien;
		this.alien_government = alienGovernment;
		this.alien_corporation = alienCorporation;
		this.alien_officer = alienOfficer;
		this.alien_control = alienControl;
		this.revoked = revoked;
		this.convicted = convicted;
		this.adjudged = adjudged;
		this.involved_reserved = involvedReserved;
		this.common_carrier = commonCarrier;
		this.non_common_carrier = nonCommonCarrier;
		this.private_comm = privateComm;
		this.fixed = fixed;
		this.mobile = mobile;
		this.setRadiolocation(radiolocation);
		this.satellite = satellite;
		this.developmental_or_sta = developmentalOrSta;
		this.interconnected_service = interconnectedService;
		this.certifier_first_name = certifierFirstName;
		this.certifier_mi = certifierMi;
		this.certifier_last_name = certifierLastName;
		this.certifier_suffix = certifierSuffix;
		this.certifier_title = certifierTitle;
		this.gender = gender;
		this.african_american = africanAmerican;
		this.native_american = nativeAmerican;
		this.hawaiian = hawaiian;
		this.asian = asian;
		this.white = white;
		this.ethnicity = ethnicity;
		this.effective_date = effectiveDate;
		this.last_action_date = lastActionDate;
		this.auction_id = auctionId;
		this.reg_stat_broad_serv = regStatBroadServ;
		this.band_manager = bandManager;
		this.type_serv_broad_serv = typeServBroadServ;
		this.alien_ruling = alienRuling;
		this.licensee_name_change = licenseeNameChange;
	}

	public String getAlien() {
		return this.alien;
	}

	public void setAlien(String alien) {
		this.alien = alien;
	}


	public String getRevoked() {
		return this.revoked;
	}

	public void setRevoked(String revoked) {
		this.revoked = revoked;
	}

	public String getConvicted() {
		return this.convicted;
	}

	public void setConvicted(String convicted) {
		this.convicted = convicted;
	}

	public String getAdjudged() {
		return this.adjudged;
	}

	public void setAdjudged(String adjudged) {
		this.adjudged = adjudged;
	}

	public String getFixed() {
		return this.fixed;
	}

	public void setFixed(String fixed) {
		this.fixed = fixed;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getSatellite() {
		return this.satellite;
	}

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHawaiian() {
		return this.hawaiian;
	}

	public void setHawaiian(String hawaiian) {
		this.hawaiian = hawaiian;
	}

	public String getAsian() {
		return this.asian;
	}

	public void setAsian(String asian) {
		this.asian = asian;
	}

	public String getWhite() {
		return this.white;
	}

	public void setWhite(String white) {
		this.white = white;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
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

	public String getCall_sign() {
		return call_sign;
	}

	public void setCall_sign(String call_sign) {
		this.call_sign = call_sign;
	}

	public String getLicense_status() {
		return license_status;
	}

	public void setLicense_status(String license_status) {
		this.license_status = license_status;
	}

	public String getRadio_service_code() {
		return radio_service_code;
	}

	public void setRadio_service_code(String radio_service_code) {
		this.radio_service_code = radio_service_code;
	}

	public String getGrant_date() {
		return grant_date;
	}

	public void setGrant_date(String grant_date) {
		this.grant_date = grant_date;
	}

	public String getExpired_date() {
		return expired_date;
	}

	public void setExpired_date(String expired_date) {
		this.expired_date = expired_date;
	}

	public String getCancellation_date() {
		return cancellation_date;
	}

	public void setCancellation_date(String cancellation_date) {
		this.cancellation_date = cancellation_date;
	}

	public String getEligibility_rule_num() {
		return eligibility_rule_num;
	}

	public void setEligibility_rule_num(String eligibility_rule_num) {
		this.eligibility_rule_num = eligibility_rule_num;
	}

	public String getApplicant_type_code_reserved() {
		return applicant_type_code_reserved;
	}

	public void setApplicant_type_code_reserved(String applicant_type_code_reserved) {
		this.applicant_type_code_reserved = applicant_type_code_reserved;
	}

	public String getAlien_government() {
		return alien_government;
	}

	public void setAlien_government(String alien_government) {
		this.alien_government = alien_government;
	}

	public String getAlien_corporation() {
		return alien_corporation;
	}

	public void setAlien_corporation(String alien_corporation) {
		this.alien_corporation = alien_corporation;
	}

	public String getAlien_officer() {
		return alien_officer;
	}

	public void setAlien_officer(String alien_officer) {
		this.alien_officer = alien_officer;
	}

	public String getAlien_control() {
		return alien_control;
	}

	public void setAlien_control(String alien_control) {
		this.alien_control = alien_control;
	}

	public String getInvolved_reserved() {
		return involved_reserved;
	}

	public void setInvolved_reserved(String involved_reserved) {
		this.involved_reserved = involved_reserved;
	}

	public String getCommon_carrier() {
		return common_carrier;
	}

	public void setCommon_carrier(String common_carrier) {
		this.common_carrier = common_carrier;
	}

	public String getNon_common_carrier() {
		return non_common_carrier;
	}

	public void setNon_common_carrier(String non_common_carrier) {
		this.non_common_carrier = non_common_carrier;
	}

	public String getPrivate_comm() {
		return private_comm;
	}

	public void setPrivate_comm(String private_comm) {
		this.private_comm = private_comm;
	}

	public String getDevelopmental_or_sta() {
		return developmental_or_sta;
	}

	public void setDevelopmental_or_sta(String developmental_or_sta) {
		this.developmental_or_sta = developmental_or_sta;
	}

	public String getInterconnected_service() {
		return interconnected_service;
	}

	public void setInterconnected_service(String interconnected_service) {
		this.interconnected_service = interconnected_service;
	}

	public String getCertifier_first_name() {
		return certifier_first_name;
	}

	public void setCertifier_first_name(String certifier_first_name) {
		this.certifier_first_name = certifier_first_name;
	}

	public String getCertifier_mi() {
		return certifier_mi;
	}

	public void setCertifier_mi(String certifier_mi) {
		this.certifier_mi = certifier_mi;
	}

	public String getCertifier_last_name() {
		return certifier_last_name;
	}

	public void setCertifier_last_name(String certifier_last_name) {
		this.certifier_last_name = certifier_last_name;
	}

	public String getCertifier_suffix() {
		return certifier_suffix;
	}

	public void setCertifier_suffix(String certifier_suffix) {
		this.certifier_suffix = certifier_suffix;
	}

	public String getCertifier_title() {
		return certifier_title;
	}

	public void setCertifier_title(String certifier_title) {
		this.certifier_title = certifier_title;
	}

	public String getAfrican_american() {
		return african_american;
	}

	public void setAfrican_american(String african_american) {
		this.african_american = african_american;
	}

	public String getNative_american() {
		return native_american;
	}

	public void setNative_american(String native_american) {
		this.native_american = native_american;
	}

	public String getEffective_date() {
		return effective_date;
	}

	public void setEffective_date(String effective_date) {
		this.effective_date = effective_date;
	}

	public String getLast_action_date() {
		return last_action_date;
	}

	public void setLast_action_date(String last_action_date) {
		this.last_action_date = last_action_date;
	}

	public Integer getAuction_id() {
		return auction_id;
	}

	public void setAuction_id(Integer auction_id) {
		this.auction_id = auction_id;
	}

	public String getReg_stat_broad_serv() {
		return reg_stat_broad_serv;
	}

	public void setReg_stat_broad_serv(String reg_stat_broad_serv) {
		this.reg_stat_broad_serv = reg_stat_broad_serv;
	}

	public String getBand_manager() {
		return band_manager;
	}

	public void setBand_manager(String band_manager) {
		this.band_manager = band_manager;
	}

	public String getType_serv_broad_serv() {
		return type_serv_broad_serv;
	}

	public void setType_serv_broad_serv(String type_serv_broad_serv) {
		this.type_serv_broad_serv = type_serv_broad_serv;
	}

	public String getAlien_ruling() {
		return alien_ruling;
	}

	public void setAlien_ruling(String alien_ruling) {
		this.alien_ruling = alien_ruling;
	}

	public String getLicensee_name_change() {
		return licensee_name_change;
	}

	public void setLicensee_name_change(String licensee_name_change) {
		this.licensee_name_change = licensee_name_change;
	}

	public String getRadiolocation() {
		return radiolocation;
	}

	public void setRadiolocation(String radiolocation) {
		this.radiolocation = radiolocation;
	}

}
