<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey Index</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
        
</head>
<body>
<div class="box">
        <form action="/login" method="post">
            
            <label for="name"> Your Name: </label>
            <input type="text" id="name" name="name"><br><br>
            Dojo Location:<select name="location">
                <option value="Bethlehem">Bethlehem</option>
                <option value="Ramallah">Ramallah</option>
                <option value="Hebron">Hebron</option>
            </select><br><br>
            Fav Language:<select name="language">
                <option value="Python">Python</option>
                <option value="Java">Java</option>
                <option value="JavaScript">JavaScript</option>
            </select><br><br>
            <label for="comm">comment (opptional):</label><br>
            <textarea name="comm" id="comm" cols="40" rows="5"></textarea><br>
            <button type='submit' class="one">Button</button>
        </form>
    </div>
</body>
</html>