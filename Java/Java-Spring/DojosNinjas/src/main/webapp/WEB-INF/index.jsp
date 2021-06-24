<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojos Ninjas</title>
</head>
<body>
<a href="/dojos/new">New Dojo</a>
<a href="/ninjas/new">New Ninja</a>
<br>
<table>
    <thead>
        <tr>
            <th>name</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${dojos}" var="dojo">
        <tr>
            <td><c:out value="${dojo.name}"/></td>
        </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>