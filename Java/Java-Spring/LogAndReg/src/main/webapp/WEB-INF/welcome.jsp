<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
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
				Welcome,
				<c:out value="${user.name}" />
			</h1>
		</div>
		<div>
			Courses  <a style="float: right;" href="/logout">Logout</a>
		</div>
		
		<!-- table courses -->
		<table class="table is-fullwidth is-bordered">
			<thead class="dashtable">
				<tr>
					<td>Course</td>
					<td>Instructor</td>
					<td>Signups</td>
					<td>Action</td>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${courses}" var="course">
				<tr>
					<td><a href="/courses/${course.id}">${course.name}</a></td>
					<td>${course.instructor}</td>
					<td>${course.getUsers().size()} / ${course.capacity}</td>
					<td>
					<c:choose>
						<c:when test="${course.getUsers().indexOf(user)!= -1}">
							Already Added
						</c:when>
						<c:otherwise>
							<c:choose>
								<c:when test="${course.getUsers().size() == course.capacity}">
									Full
								</c:when>
								<c:otherwise>
									<a href="/courses/add/${course.id}">Add</a>
								</c:otherwise>
							</c:choose>	
						</c:otherwise>
					</c:choose>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="buttons has-addons">
			<a href="/courses/new" class="button is-dark">Add Course</a>
		</div>

	</div>
</body>
</html>