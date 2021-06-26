<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Product</title>
</head>
<body>
<h1>New Product</h1>
<br>
	<form:form action="/product/new" method="post"
		modelAttribute="product">
		
		<form:label path="name">Name: 
				<form:input type="text" path="name" />
		</form:label>
		<br><br>
		<form:label path="description">Description: 
				<form:input type="textarea" path="description" />
		</form:label>
		<br><br>
		<form:label path="price">Price: 
				<form:input type="number" path="price" />
		</form:label>
		<br><br>
		<br>
		<input type="submit" value="Create">

	</form:form>
</body>
</html>