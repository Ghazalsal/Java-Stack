<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify Dashboard</title>
</head>
<body>
	<p>
		<a href="/songs/new">Add New</a> <a href="/search/topTen">Top Songs</a>
	<div class="search-container">
		<form action="/search" method="post">
			<input type="search" id="site-search" name="artist"
				aria-label="Search through site content">
		<input type="submit" value="Search Artists">
		</form>
	</div>
	</p>
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
			<c:forEach items="${lookifys}" var="lookify">
				<tr>
					<td><a href="/songs/${lookify.id}"><c:out
								value="${lookify.title}" /></a></td>
					<td><c:out value="${lookify.artist}" /></td>
					<td><c:out value="${lookify.rating}" /></td>
					<td><form action="/songs/delete/${lookify.id}" method="post">
							<input type="hidden" name="_method" value="delete"> <input
								type="submit" value="Delete">
						</form></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>