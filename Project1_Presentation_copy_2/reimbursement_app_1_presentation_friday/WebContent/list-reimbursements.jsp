<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reimbursement Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">

</head>

<!--  -->
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Reimbursement(s) View/Update WebApp</h2>		
		</div>
	</div>
	
	<div id="container">
		<div id="content">
		
		<!--  add remibursement button-->
		
		<input type="button" value="+Reimbursement"
			onclick="window.location.href='add-reimbursement-form.jsp'; return false;"
				class="add-student-button"
				/>
		
		<!--  add remibursement button-->
		
			<table>
			
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Learning Institution Name</th>
					<th>Receipt Link</th>
					<th>Proof Of Completion Link</th>
					<th>Manager Email</th>
					<th>Submit Date</th>
					<th>Start Date</th>
					<th>Completion Date</th>
					<th>Approved By (Email)</th>
					<th>Approval Date</th>
					<th>Reimbursement ID#</th>
					<th>Revision</th>
					
				</tr>
				
				
				
				<c:forEach var="tempReimbursement" items="${REIMBURSEMENTS_LIST}">
				
					
					
					<!--  set up link for each -->
					<c:url var="tempLink" value="ReimbursementControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="reimbursementId" value="${tempReimbursement.reimbursementId}" />
					</c:url>

						<!-- set up link to delete  -->
						
						<c:url var="deleteLink" value="ReimbursementControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="reimbursementId" value="${tempReimbursement.reimbursementId}" />
					</c:url>
					<tr>
						<td>${tempReimbursement.firstName}</td>
						<td>${tempReimbursement.lastName}</td>
						<td>${tempReimbursement.userName}</td>
						<td>${tempReimbursement.schoolName}</td>
						<td>${tempReimbursement.receiptLink}</td>
						<td>${tempReimbursement.proofOfCompletionLink}</td>
						<td>${tempReimbursement.managerEmail}</td>
						<td>${tempReimbursement.submitDate}</td>
						<td>${tempReimbursement.courseStartDate}</td>
						<td>${tempReimbursement.courseEndDate}</td>
						<td>${tempReimbursement.approvedByUsername}</td>
						<td>${tempReimbursement.approvalDate}</td>
						<td>${tempReimbursement.reimbursementId}</td>
						<td>
						<a href="${tempLink}">Update</a>
						 
						 <a href="${deleteLink}"
						  onclick="if (!(confirm('Are you sure you want to delete this reimbursement?'))) return false">Delete</a>
						</td>
					</tr>

				</c:forEach>
			
			</table>
			</br>
			<a href="ManagmentHome.jsp">Go Back</a>
		</div>
	
	</div>

</body>
</html>