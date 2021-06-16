<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@page import="java.io.*,java.util.*, javax.servlet.*" %>
	<%@page import="java.text.DateFormat"%>
	<%@page import="java.text.SimpleDateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app1.js"></script>
<title>Time</title>
</head>
<body>
	<h2>
		<% DateFormat dateFormat = new SimpleDateFormat("HH:MM a");
	       Date date = new Date(); out.println(dateFormat.format(date));
	    %>
    </h2>
</body>
</html>