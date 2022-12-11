<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h1 style="color:red; text-align:center">Register Contact</h1>

<form:form modelAttribute="contact">
	<table>
		<tr>
			<td>NAME:</td>
			<td><form:input path="name"/></td>
		</tr>
		<tr>
			<td>EMAIL:</td>
			<td><form:input path="email"/></td>
		</tr>
		<tr>
			<td>PHONE  NUMBER:</td>
			<td><form:input path="phNo"/></td>
		</tr>
		<tr>
			<td colspan="2" align:"center"><input type="submit" value="register_contact"/></td>
		</tr>
	</table>
</form:form>