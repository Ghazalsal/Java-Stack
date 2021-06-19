<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<form method="POST">
        
        Your Gold:<c:out value="${gold}"/>
    </form>
    <section>
        <div class="box">
            <h3>Farm </h3>
            <p>(earns 10-20 golds)</p>
            
            <form action="/process_money" method="POST">
            
                
                <input type="hidden" name="forms" value="farm">
                <button >Find Gold!</button>
            </form>
        </div>
        <div class="box">
            <h3>Cave</h3>
            <p>(earns 5-10 golds)</p>
            <form action="/process_money" method="POST">
                
                <input type="hidden" name="forms" value="cave">
                <button >Find Gold!</button>
            </form>
        </div>
        <div class="box">
            <h3>House </h3>
            <p>(earns 2-5 golds)</p>
            <form action="/process_money" method="POST">
                
                <input type="hidden" name="forms" value="house">
                <button >Find Gold!</button>
            </form>
        </div>
        <div class="box">
            <h3>Casino</h3>
            <p>(earns/takes 0-50 golds)</p>
            <form action="/process_money" method="POST">
                
                <input type="hidden" name="forms" value="casino">
                <button >Find Gold!</button>
            </form>
        </div>
    </section>
    <article>
        <p>Activities</p>
        
        <c:out value="${ activity}"/><br>
    </article>
</body>
</html>