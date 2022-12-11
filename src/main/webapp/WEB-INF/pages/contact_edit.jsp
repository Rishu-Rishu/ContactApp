<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<h1 style="text-align:center">Edit Contact Page</h1>
<form:form modelAttribute="contact">
	<table border="1" bgcolor="cyan" align="center">
		<tr>
			<td>SERIAL NUM:</td>
			<td><form:input path="id" readonly="true"/></td>
		</tr>
		<tr>
			<td>NAME:</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>EMAIL:</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>PHONE NUM:</td>
			<td><form:input path="phNo"/></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="Update Contact"/></td>
		</tr>
	</table>
</form:form>