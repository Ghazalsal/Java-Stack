<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/bulma/0.7.1/css/bulma.min.css">
<script defer
	src="https://use.fontawesome.com/releases/v5.1.0/js/all.js"></script>
</head>
<body>

	<div class="container">
		<div class="notification">
			<h1 class="title">
				<c:out value="${course.name}" />
			</h1>
		</div>
		<div>
			<a href="/courses">Dashboard</a> | <a href="/logout">Logout</a>
		</div>
		<div>
			<h1 class="subtitle">
				Instructor:
				<c:out value="${course.instructor}" />
			</h1>
			<h1 class="subtitle">Sign Ups: ${course.getUsers().size() }</h1>
		</div>

		<div class="buttons has-addons is-right">
			<a href="/asc">Low Sign Date ASC</a> &nbsp;&nbsp; | &nbsp;&nbsp; <a
				href="/desc">Sign Up Date DESC</a>
		</div>

		<!-- table courses -->
		<table class="table is-fullwidth is-bordered">
			<thead class="dashtable">
				<tr>
					<td>Student Name</td>
					<td>Sign Up Date</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${course.getUsers()}" var="user">
					<tr>
						<td>${user.name}</td>
						<td><fmt:formatDate value="${user.createdAt}"
								pattern="MM/dd/yyyy HH:mm:ss a" /></td>

						<c:choose>
						<c:when test="${user.getId() == currentUser.getId()}">
							<c:choose>
							<c:when test="${course.getUsers().indexOf(currentUser)!= -1}">
								<td><a href="/courses/${course.id}/remove">Remove</a></td>
							</c:when>
							<c:otherwise>
									<td><a href="/courses/${course.id}/add">Add</a></td>
							</c:otherwise>
							</c:choose>
						</c:when>
						<c:otherwise>
							<td></td>
						</c:otherwise>
						</c:choose>
					</tr>
				</c:forEach>

			</tbody>
		</table>


		<a href="/courses/${course.id}/edit" class="button is-dark">Edit</a> <a
			href="/courses/delete/${course.id}" class="button is-dark">Delete</a>


	</div>
</body>
</html>