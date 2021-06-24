<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create License</title>
</head>
<body>
<h1>New License</h1>
<form:form action="/license/create" method="post" modelAttribute="license">
		<form:label path="driver">Name</form:label>
		<form:select path="driver">
			<c:forEach items="${driver}" var="driver">
				<form:option value="${driver.id}">
					<c:out value="${driver.firstName}  ${driver.lastName}" />
				</form:option>
			</c:forEach>
		</form:select><br><br>
		<form:label path="state">State: 
				<form:input type="text" path="state" />
		</form:label>
		<br><br>
		<form:label path="expiration_date">Expiration Date: 
				<form:errors path="expiration_date" />
			<form:input type="date" path="expiration_date" />
		</form:label>
		<br><br>
		<input type="submit" value="Create">

	</form:form>

</body>
</html>