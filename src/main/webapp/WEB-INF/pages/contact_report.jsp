<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:if test="${!empty resultMsg}">
		<h3 style="color:green; text-align:center">${resultMsg}</h3>
</c:if>
	
<c:choose>
	<c:when test="${!empty contactList}">
		<table  border="1" bgcolor="cyan" align="center">
			<tr>
				<th>SI NO.</th>
				<th>NAME</th>
				<th>EMAIL</th>
				<th>PHONE NUMBER</th>
			</tr>
			<c:forEach var="contact" items="${contactList}">
				<tr>
					<td>${contact.id }</td>
					<td>${contact.name}</td>
					<td>${contact.email}</td>
					<td>${contact.phNo}</td>
					<td><a href="edit?no=${contact.id}">Edit</a> &nbsp;&nbsp;&nbsp; <a onclick="return confirm('click ok to delete the contact')" href="delete?no=${contact.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:when>
	<c:otherwise>
		<h1 style="color:red; text-align:center">Records Not Found</h1>
	</c:otherwise>
</c:choose>
<br> <br>
<hr>
<h1 style="text-align:center"><a href="add">Add Contact</a></h1>