<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/app.js"></script>
<title>Date</title>
</head>
<body>
	
	 <%java.text.DateFormat df = new java.text.SimpleDateFormat("EEEE, 'the 'dd 'of' MMMM yyyy"); %>
<h2> <%= df.format(new java.util.Date()) %> </h2>
</body>
</html>