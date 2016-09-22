<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

			<h2>FCC DB SF record results, listed below...</h2>

			<div>
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
