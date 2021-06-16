<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<div class="box">
        <h1>submitted info</h1>
        <p>Name: <c:out value="${name}"/></p>
        <p>dojo Location: <c:out value="${location}"/></p>
        <p>Fav Lang: <c:out value="${language}"/>!!</p>
        <p>Comment: <c:out value="${comm}"/></p>
        <form action="/" method="post">
            
            <button type='submit' class="one">Go Back</button>
        </form>
    </div>
</body>
</html>