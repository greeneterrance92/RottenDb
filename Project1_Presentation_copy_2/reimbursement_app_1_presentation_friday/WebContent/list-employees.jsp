<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Tracker App</title>
<link type="text/css" rel="stylesheet" href="css/style.css">
</head>

<!-- //EMPLOYEES_LIST -->
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Employee(s) View/Update WebApp</h2>
		</div>
	</div>

	
		<div id="container">
	
		<div id="content">
		
		
		<!-- add employee button -->
		<input type="button" value="Add Employee"
			onclick="window.location.href='add-employee-form.jsp'; return false;"
				class="add-student-button"/>
		<!-- end add employee button -->
		
			<table>
			
			
				<tr>
					<th>Email</th>
					<th>Password</th>
					<th>Access Level</th>
					<th>DOB</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Manager Email</th>
					<th>Revision</th>
					
				</tr>
				
				<c:forEach var="tempEmployee" items="${EMPLOYEES_LIST}">
					
						<!--  set up link for each -->
						<c:url var="tempLink" value="EmployeeControllerServlet">
						<c:param name="command" value="LOAD" />
						<c:param name="employeeId" value="${tempEmployee.id}" />
						</c:url>
						
						<!-- set up link to delete -->
						<c:url var="deleteLink" value="EmployeeControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="employeeId" value="${tempEmployee.id}" />
						</c:url>
					<tr> 
						<td> ${tempEmployee.userName}</td>
						<td> ${tempEmployee.passWord}</td>
						<td> ${tempEmployee.accessLevel}</td>
						<td> ${tempEmployee.dob}</td>
						<td> ${tempEmployee.firstName}</td>
						<td> ${tempEmployee.lastName}</td>
						<td> ${tempEmployee.managerEmail}</td>
						
						<td> 
						
						<a href="${tempLink}">Update</a>
						
						<a href="${deleteLink}"
						onclick="if (!(confirm('Are you sure you want to delete this employee?'))) return false">
						Delete</a>
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