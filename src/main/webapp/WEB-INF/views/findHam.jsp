<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

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


		<h2>Ham Lookup - The FCC Amateur Radio License DB Call Sign, Name
			Search...</h2>

		<div>

			<form:form id="findHam" action="findHam.html" commandName="hdRec">

				<table>
					<tr>

						<td><label>Search for Call Sign:</label></td>
						<td><form:input id="findCallSign" cssClass="input10"
								path="call_sign" tabindex="1" /></td>
					</tr>

					<tr>

						<td><label>Search by Last Name:</label></td>
						<td><form:input id="findLastName" cssClass="input10"
								path="certifier_last_name" tabindex="1" /></td>
					</tr>

					<tr>

						<td><label>Search by First Name:</label></td>
						<td><form:input id="findFirstName" cssClass="input10"
								path="certifier_first_name" tabindex="1" /></td>
					</tr>

				</table>

				<div id="readyFindButton">
					<input type="submit" class="button" name="findHam"
						value="Ready to Find" />
				</div>

			</form:form>


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
							<td class="label">Ham Radio Licensee:</td>
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
