<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Categories</title>
</head>
<body>
	<h1>
		<c:out value="${category.name}" />
	</h1>
	<h2>Products:</h2>
	<ul>
		<c:forEach items="${category.products }" var="product">
			<li><c:out value="${product.name}" /></li>
		</c:forEach>
	</ul>
	<h2>Add Product:</h2>

	<form action="/categories/${category.id}" method="POST">
		<label for="product">Product:</label> <select name="product">
			<c:forEach items="${products}" var="product">
				<option value="${product.id}">
					<c:out value="${product.name}" />
				</option>
			</c:forEach>
		</select><br>
		<br> <input type="submit" value="Add Product">
	</form>
</body>
</html>