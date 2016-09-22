<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml" dir="ltr">
<head profile="http://gmpg.org/xfn/11">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Ham Lookup</title>
<script type="text/javascript"
	src="/hamlookup/resources/jquery-1.3.2.js"></script>
<script type="text/javascript"
	src="/hamlookup/resources/jquery.quickflip.js"></script>
<link rel="stylesheet" type="text/css"
	href="/hamlookup/resources/styles.css" />
</head>
<body>

	<div class="post-container">
		<div class="post-thumb">
			<a href="/hamlookup/find" title="Ham Lookup Online Amateur Radio Callbook"> <img
				src="/hamlookup/resources/hamRadio.png" class="l_header-logo"
				alt="HamLookup" />
			</a>
		</div>
		<div class="post-content">
			<a href="/" title="Ham Lookup">
				<h1>
					Ham Lookup<small>callbook</small>
				</h1>
			</a>
		</div>
	</div>

	<div id="mainbody">

		<div id="flip-tabs">

			<h2>FCC DB query results, HD record:</h2>

			<div>
				<table border="1">
					<tr>
						<th>Call Sign</th>
						<th>Last Name</th>
						<th>First Name</th>
						<th>M.I.</th>

						<th>Suffix</th>
						<th>Effective Date</th>
						<th>Last Action Date</th>


						<th>Record Type</th>
						<th>Unique System Identifier</th>
						<th>ULS File Number</th>

						<th>License Status</th>
						<th>Dev/Sta</th>
						<th>Radio Svc Code</th>
						<th>Grant Date</th>
						<th>Expire Date</th>
						<th>Cancellation Date</th>
					</tr>

					<c:forEach var="pubaccHd" items="${pubaccHdList}"
						varStatus="status">

						<tr>

							<td>${pubaccHd.call_sign}</td>
							<td>${pubaccHd.certifier_last_name}</td>
							<td>${pubaccHd.certifier_first_name}</td>
							<td>${pubaccHd.certifier_mi}</td>


							<td>${pubaccHd.certifier_suffix}</td>
							<td>${pubaccHd.effective_date}</td>
							<td>${pubaccHd.last_action_date}</td>



							<td>${pubaccHd.record_type}</td>

							<td>${pubaccHd.unique_system_identifier}<a
								href="enRecord?uid=${pubaccHd.unique_system_identifier}"
								title="EN record for UID ${pubaccHd.unique_system_identifier}">EN</a>
								<a href="amRecord?uid=${pubaccHd.unique_system_identifier}"
								title="AM record for UID ${pubaccHd.unique_system_identifier}">AM</a>
								<a href="hsRecord?uid=${pubaccHd.unique_system_identifier}"
								title="HS record for UID ${pubaccHd.unique_system_identifier}">HS</a>
								<a href="coRecord?uid=${pubaccHd.unique_system_identifier}"
								title="CO record for UID ${pubaccHd.unique_system_identifier}">CO</a>
								<a href="scRecord?uid=${pubaccHd.unique_system_identifier}"
								title="SC record for UID ${pubaccHd.unique_system_identifier}">SC</a>
								<a href="sfRecord?uid=${pubaccHd.unique_system_identifier}"
								title="SF record for UID ${pubaccHd.unique_system_identifier}">SF</a>
								<a href="laRecord?uid=${pubaccHd.unique_system_identifier}"
								title="LA record for UID ${pubaccHd.unique_system_identifier}">LA</a>
							</td>

							<td>${pubaccHd.uls_file_number}</td>
							<td>${pubaccHd.license_status}</td>
							<td>${pubaccHd.developmental_or_sta}</td>
							<td>${pubaccHd.radio_service_code}</td>
							<td>${pubaccHd.grant_date}</td>
							<td>${pubaccHd.expired_date}</td>
							<td>${pubaccHd.cancellation_date}</td>

						</tr>

					</c:forEach>
				</table>

			</div>

			<br />
			<br />
			<br />
			<br />

			<div>
				<c:choose>
					<c:when test="${empty pubaccHsList}">
				        No HS record for this UID.
				    </c:when>
					<c:otherwise>
						<h2>HS record:</h2>
						<table border="1">
							<tr>
								<th>Record Type</th>
								<th>Unique System Identifier</th>
								<th>ULS File Number</th>

								<th>callsign</th>
								<th>log_date</th>
								<th>code</th>
							</tr>

							<c:forEach var="pubaccHs" items="${pubaccHsList}"
								varStatus="status">
								<tr>

									<td>${pubaccHs.id.record_type}</td>
									<td>${pubaccHs.id.unique_system_identifier}</td>
									<td>${pubaccHs.id.uls_file_number}</td>


									<td>${pubaccHs.id.callsign}</td>
									<td>${pubaccHs.id.log_date}</td>
									<td>${pubaccHs.id.code}</td>


								</tr>
							</c:forEach>

						</table>

					</c:otherwise>
				</c:choose>
			</div>

			<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccEn}">
			        No EN record for UID.
			    </c:when>
					<c:otherwise>
						<h2>EN record:</h2>
						<table border="1">
							<tr>
								<th>Record Type</th>
								<th>Unique System Identifier</th>
								<th>ULS File Number</th>


								<th>ebf_number</th>
								<th>call_sign</th>
								<th>entity_type</th>
								<th>licensee_id</th>
								<th>entity_name</th>
								<th>first_name</th>
								<th>mi</th>
								<th>last_name</th>
								<th>suffix</th>
								<th>phone</th>
								<th>fax</th>
								<th>email</th>
								<th>street_address</th>
								<th>city</th>
								<th>state</th>
								<th>zip_code</th>
								<th>po_box</th>
								<th>attention_line</th>
								<th>sgin</th>
								<th>frn</th>
								<th>applicant_type_code</th>
								<th>applicant_type_other</th>
								<th>status_code</th>
								<th>status_date</th>

							</tr>


							<tr>

								<td>${pubaccEn.record_type}</td>
								<td>${pubaccEn.unique_system_identifier}</td>


								<td>${pubaccEn.uls_file_number}</td>


								<td>${pubaccEn.ebf_number}</td>
								<td>${pubaccEn.call_sign}</td>
								<td>${pubaccEn.entity_type}</td>
								<td>${pubaccEn.licensee_id}</td>
								<td>${pubaccEn.entity_name}</td>
								<td>${pubaccEn.first_name}</td>
								<td>${pubaccEn.mi}</td>
								<td>${pubaccEn.last_name}</td>
								<td>${pubaccEn.suffix}</td>
								<td>${pubaccEn.phone}</td>
								<td>${pubaccEn.fax}</td>
								<td>${pubaccEn.email}</td>
								<td>${pubaccEn.street_address}</td>
								<td>${pubaccEn.city}</td>
								<td>${pubaccEn.state}</td>
								<td>${pubaccEn.zip_code}</td>
								<td>${pubaccEn.po_box}</td>
								<td>${pubaccEn.attention_line}</td>
								<td>${pubaccEn.sgin}</td>
								<td>${pubaccEn.frn}</td>
								<td>${pubaccEn.applicant_type_code}</td>
								<td>${pubaccEn.applicant_type_other}</td>
								<td>${pubaccEn.status_code}</td>
								<td>${pubaccEn.status_date}</td>


							</tr>


						</table>

					</c:otherwise>
				</c:choose>

			</div>

			<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccCoList}">
			        No CO record for UID.
			    </c:when>
					<c:otherwise>
						<h2>CO record:</h2>

						<table border="1">
							<tr>
								<th>Record Type</th>
								<th>Unique System Identifier</th>
								<th>ULS File Number</th>

								<th>callsign</th>
								<th>comment date</th>
								<th>description</th>
								<th>status code</th>

							</tr>

							<c:forEach var="pubaccCo" items="${pubaccCoList}"
								varStatus="status">
								<tr>

									<td>${pubaccCo.id.record_type}</td>
									<td>${pubaccCo.id.unique_system_identifier}</td>
									<td>${pubaccCo.id.uls_file_num}</td>


									<td>${pubaccCo.id.callsign}</td>


									<td>${pubaccCo.id.comment_date}</td>
									<td>${pubaccCo.id.description}</td>
									<td>${pubaccCo.id.status_code}</td>


								</tr>
							</c:forEach>

						</table>

					</c:otherwise>
				</c:choose>

			</div>

			<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccAm}">
        No AM record for UID.
    </c:when>
					<c:otherwise>
						<h2>AM record:</h2>
						<table border="1">
							<tr>
								<th>Record Type</th>
								<th>Unique System Identifier</th>
								<th>ULS File Number</th>


								<th>Call Sign</th>
								<th>Class</th>
								<th>Group</th>
								<th>Region</th>
								<th>Trustee Callsign</th>

								<th>Trustee Indicator</th>


								<th>physician_certification</th>
								<th>ve_signature</th>
								<th>systematic_callsign_change</th>
								<th>vanity_callsign_change</th>
								<th>vanity_relationship</th>
								<th>previous_callsign</th>
								<th>previous_operator_class</th>
								<th>trustee_name</th>

							</tr>


							<tr>

								<td>${pubaccAm.record_type}</td>
								<td>${pubaccAm.unique_system_identifier}</td>


								<td>${pubaccAm.uls_file_num}</td>
								<td>${pubaccAm.callsign}</td>
								<td>${pubaccAm.operator_class}</td>
								<td>${pubaccAm.group_code}</td>
								<td>${pubaccAm.region_code}</td>
								<td>${pubaccAm.trustee_callsign}</td>
								<td>${pubaccAm.trustee_indicator}</td>
								<td>${pubaccAm.physician_certification}</td>
								<td>${pubaccAm.ve_signature}</td>
								<td>${pubaccAm.systematic_callsign_change}</td>
								<td>${pubaccAm.vanity_callsign_change}</td>
								<td>${pubaccAm.vanity_relationship}</td>
								<td>${pubaccAm.previous_callsign}</td>
								<td>${pubaccAm.previous_operator_class}</td>
								<td>${pubaccAm.trustee_name}</td>

							</tr>


						</table>

					</c:otherwise>
				</c:choose>

			</div>
			
			
						<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccLaList}">
			        No LA record for UID.
			    </c:when>
					<c:otherwise>
						<h2>LA record:</h2>
										<table border="1">
					<tr>

						<th>Record Type</th>
						<th>Unique System Identifier</th>
						<th>callsign</th>
						<th>Attachment Code</th>
						<th>Attachment Description</th>
						<th>Attachment Date</th>
						<th>Attachment Filename</th>
						<th>Action Performed</th>
					</tr>

					<c:forEach var="pubaccLa" items="${pubaccLaList}"
						varStatus="status">
						<tr>

							<td>${pubaccLa.id.record_type}</td>
							<td>${pubaccLa.id.unique_system_identifier}</td>
							<td>${pubaccLa.id.callsign}</td>
							<td>${pubaccLa.id.attachment_code}</td>
							<td>${pubaccLa.id.attachment_desc}</td>
							<td>${pubaccLa.id.attachment_date}</td>
							<td>${pubaccLa.id.attachment_filename}</td>
							<td>${pubaccLa.id.action_performed}</td>

						</tr>
					</c:forEach>

				</table>
				</c:otherwise>
				</c:choose>
				</div>
				
						
						
						
			<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccScList}">
			        No SC record for UID.
			    </c:when>
					<c:otherwise>
						<h2>SC record:</h2>
										<table border="1">
					<tr>

						<th>Record Type</th>
						<th>Unique System Identifier</th>
						<th>ULS File Number</th>
						<th>EBF Number</th>
						<th>callsign</th>
						<th>Special Condition Type</th>
						<th>Special Condition Code</th>
						<th>status code</th>
					</tr>

					<c:forEach var="pubaccSc" items="${pubaccScList}"
						varStatus="status">
						<tr>

							<td>${pubaccSc.id.record_type}</td>
							<td>${pubaccSc.id.unique_system_identifier}</td>
							<td>${pubaccSc.id.uls_file_number}</td>
							<td>${pubaccSc.id.ebf_number}</td>
							<td>${pubaccSc.id.callsign}</td>
							<td>${pubaccSc.id.special_condition_type}</td>
							<td>${pubaccSc.id.special_condition_code}</td>
							<td>${pubaccSc.id.status_code}</td>

						</tr>
					</c:forEach>

				</table>
						</c:otherwise>
						</c:choose>
						</div>
						
						
						
						
			<br />
			<br />
			<br />
			<br />

			<div>

				<c:choose>
					<c:when test="${empty pubaccSfList}">
			        No SF record for UID.
			    </c:when>
					<c:otherwise>
						<h2>SF record:</h2>												
			
							<table border="1">
					<tr>

						<th>Record Type</th>
						<th>Unique System Identifier</th>
						<th>ULS File Number</th>
						<th>EBF Number</th>
						<th>Call Sign</th>
						<th>lic_freeform_cond_type</th>
						<th>unique_lic_freeform_id</th>
						<th>sequence_number</th>
						<th>lic_freeform_condition</th>
						<th>status_code</th>
					</tr>

					<tr>

						<td>${pubaccSf.record_type}</td>
						<td>${pubaccSf.unique_system_identifier}</td>
						<td>${pubaccSf.uls_file_num}</td>
						<td>${pubaccSf.callsign}</td>
						<td>${pubaccSf.ebf_number}</td>
						<td>${pubaccSf.callsign}</td>
						<td>${pubaccSf.lic_freeform_cond_type}</td>
						<td>${pubaccSf.unique_lic_freeform_id}</td>
						<td>${pubaccSf.sequence_number}</td>
						<td>${pubaccSf.lic_freeform_condition}</td>
						<td>${pubaccSf.status_code}</td>

					</tr>


				</table>
				</c:otherwise>
				</c:choose>
				</div>
			
			
			
		</div>
	</div>

	<c:choose>
		<c:when test="${page_number eq 1}">
			<div id="page-nav">
				<a href="bvtDashboardPage?page_number=${page_number}"
					title="Goto Page ${page_number}">Next</a>
			</div>
		</c:when>
		<c:otherwise>
			<div id="page-nav">
				<c:set var="last_page" value="${page_number - 2}" />
				<a href="bvtDashboardRelease" title="Goto Page 0"><<</a> | <a
					href="bvtDashboardPage?page_number=${last_page}"
					title="Goto Page ${last_page}">Back</a> | <a
					href="bvtDashboardPage?page_number=${page_number}"
					title="Goto Page ${page_number}">Next</a>
			</div>
		</c:otherwise>
	</c:choose>



	<div id="legend-block">
		<table id="table-legend">
			<tr>
				<td class="legend">
					<table>
						<tr>
							<th class="label">Ham Radio Licensee:</th>
						</tr>
					</table>
				</td>

			</tr>
			<tr>
				<td class="legend">
					<table>
						<tr>
							<td class="label">Amateur radio operations.</td>
						</tr>
					</table>
				</td>

			</tr>

			<tr>
				<td class="legend">
					<table>
						<tr>
							<td class="label">Radio lorem ipsum.</td>
						</tr>
					</table>
				</td>

			</tr>

			<tr>
				<td class="legend">
					<table>
						<tr>
							<td class="label">Call signs, names, addresses, QTH
								locations.</td>
						</tr>
					</table>
				</td>

			</tr>

			<tr>
				<td class="legend">
					<table>
						<tr>
							<td class="label">Awareness, fulfillment, transparency,
								efficiency.</td>
						</tr>
					</table>
				</td>

			</tr>

		</table>

		<div id="inset-label">Legend</div>
	</div>





</body>
</html>
