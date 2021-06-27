<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Questions Dashboard</title>
</head>
<body>
<h1>Questions Dashboard</h1>
<br>
<br>
<div class="container">
			<h1 class="title">Question Dashboard</h1>
		
		<table >
			<thead>
				<tr>
					<td >Questions</td>
					<td>Tags</td>
				</tr>
			</thead>
			<tbody>
					<c:forEach items="${questions}" var="q" varStatus="loop">
					<tr>	
					<td ><a href="/questions/${q.id}"><c:out value="${q.question}"/></a></td>
							<td >
							<c:forEach items="${q.tags}" var="tags">
								${tags.subject}
							</c:forEach>
							</td>
					</tr>
					</c:forEach>
			</tbody>
		</table>
		
			<a href="/questions/new">New Question</a>
	</div>
</body>
</html>