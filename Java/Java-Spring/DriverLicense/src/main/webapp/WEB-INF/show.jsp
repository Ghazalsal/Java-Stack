<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile Page</title>
</head>
<body>
<h1><c:out value="${driver.firstName} ${driver.lastName }"/></h1>
	<h3>License number:  <c:out value="${driver.license.number}"/></h3>
	<h3>State:   <c:out value="${driver.license.state}" /></h3>
	
	<%-- <h3>Expiration Date   <c:out value="${person.license.expiration_date}" /></h3> --%>
	
	<!-- Convert and format date in JSP compare to above-->
	<!-- include this "<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>" on top of the page -->
	<h3>Expiration Date:  <fmt:formatDate value="${driver.license.expiration_date}" pattern="MM-dd-yyyy" /></h3>

</body>
</html>