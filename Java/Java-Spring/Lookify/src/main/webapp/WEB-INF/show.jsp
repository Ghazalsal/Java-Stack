<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Details</title>
</head>
<body>
<a href="/dashboard" style="float: right">Dashboard</a>
<p>Title: <c:out value="${lookify.title}"/></p>
<p>Artist: <c:out value="${lookify.artist}"/></p>
<p>Rating: <c:out value="${lookify.rating}"/></p>
<form action="/songs/delete/${lookify.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>
</body>
</html>