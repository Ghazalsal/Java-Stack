<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<link rel="stylesheet" href="/css/home.css" />
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<div class="container">
		<form:form class="user-form" action="/registration" method="post"
			modelAttribute="user">
			<h2>Register</h2>
			<div class="form-group">
				<form:label path="name">Name: </form:label>
				<form:errors path="name" />
				<form:input class="form-control" path="name" />
			</div>
			<div class="form-group">
				<form:label path="email">Email</form:label>
				<form:errors path="email" />
				<form:input type="email" class="form-control" path="email" />
			</div>

			<div class="form-group">
				<form:label path="password">Password</form:label>
				<form:errors path="password" />
				<form:password class="form-control" path="password" />
			</div>
			<div class="form-group">
				<form:label path="passwordConfirmation">Confirm Password</form:label>
				<form:errors path="passwordConfirmation" />
				<form:password class="form-control" path="passwordConfirmation" />
			</div>
			<button>Register</button>
		</form:form>
		<form action="/login" class="user-form" method="post">
			<h2>Login</h2>
			<span>${ error }</span>
			<div class="form-group">
				<label for="email">Email</label> <input type="email" name="email"
					id="email" class="form-control" />
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					name="password" id="password" class="form-control" />
			</div>
			<button>Login</button>
		</form>
	</div>
</body>
</html>