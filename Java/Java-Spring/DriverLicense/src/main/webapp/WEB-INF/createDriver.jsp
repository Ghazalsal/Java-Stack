<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Driver</title>
</head>
<body>
<h1>New Person</h1>
<form:form action="/persons/create" method="post" modelAttribute="driver">
    <p>
        <form:label path="firstName">First Name: </form:label>
        <form:errors path="firstName"/>
        <form:input path="firstName"/>
    </p>
    <p>
        <form:label path="lastName">Last Name: </form:label>
        <form:errors path="lastName"/>
        <form:input path="lastName"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>