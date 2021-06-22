<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Top Ten</title>
</head>
<body>
<h1>Top Ten Songs: <a href="/dashboard" style="float: right">Dashboard</a> </h1>
<table>
		<thead>
			<tr>
				<th>Title</th>

				<th>Artist</th>
				<th>Rating</th>
				<th>Action</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${lookify}" var="lookify">
				<tr>
					<td><c:out value="${lookify.rating}" /></td>
					<td><a href="/songs/${lookify.id}"><c:out
								value="${lookify.title}" /></a></td>
					<td><c:out value="${lookify.artist}" /></td>
					

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>