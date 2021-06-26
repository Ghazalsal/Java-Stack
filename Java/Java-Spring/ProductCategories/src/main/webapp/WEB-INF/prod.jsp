<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Show Product</title>
</head>
<body>
	<h1>
		<c:out value="${product.name}" />
	</h1>
	<h2>Categories:</h2>
	<ul>
		<c:forEach items="${product.categories }" var="category">
			<li><c:out value="${category.name}" /></li>
		</c:forEach>
	</ul>
	<h2>Add Category:</h2>
	
	<form action="/products/${product.id}" method="POST">
		<label for="category">Category:</label> 
			<select name="category">
				<c:forEach items="${categories}" var="category">
					<option value="${category.id}">
						<c:out value="${category.name}" />
					</option>
				</c:forEach>
			</select><br><br> 
			<input type="submit" value="Add Category">
	</form>
	
</body>
</html>