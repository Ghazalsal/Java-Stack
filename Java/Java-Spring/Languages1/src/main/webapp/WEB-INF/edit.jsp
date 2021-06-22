<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ page isErrorPage="true"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<h1>Edit Language</h1>
	<form:form action="/languages/update/${language.id}" method="POST"
		modelAttribute="language">
		<input type="hidden" name="_method" value="put">
		<p>
			<form:label path="name">Name</form:label>
			<form:input path="name" />
			<form:errors path="name" />
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:input path="creator" />
			<form:errors path="creator" />
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:input path="version" />
			<form:errors path="version" />
		</p>

		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>