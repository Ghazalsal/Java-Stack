<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>welcome <c:out value ="${name}"/> </p>
	<h1>
		Welcome back:
		<% 
			String name = session.getAttribute("name")+ "";
			out.print(name);
		%>
	
	</h1>
</body>
</html>