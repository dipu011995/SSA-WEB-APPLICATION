<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ssa_web_info</title>
</head>
<body>
	<h2 style="color: red;text-align: center">SSA REGISTRATION FORM</h2>
	${ssnNumber}
	<form:form action="registerSSAAccount" method="POST" modelAttribute="swmodel">
	<br>
		<table border="5">
			<tr>
				<td>First Name :</td>
				<td><form:input path="fname"/></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input path="lname"/></td>
			</tr>
			<tr>
				<td>D.O.B :</td>
				<td><form:input path="dob" type="date"/></td>
			</tr>
			<tr>
				<td>GENDER :</td>
				<td>
					<form:radiobutton path="gender" value="M"/>MALE
					<form:radiobutton path="gender" value="F"/>FEMALE
					<form:radiobutton path="gender" value="O"/>OTHERS
				</td>
			</tr>
			<tr>
				<td>State : </td>
				<td>
					<form:select path="stateName">
						<form:option value=" " >-select-</form:option>
						<form:options items="${allState}" />
					</form:select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>