
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Bank App</title>
</head>
<body>
<h1>Bank App</h1>

<form method="post" action="richest" >
    <input name="max1" type="text" size="10" value="${max}" placeholder="Enter 'get'">
    <button type="submit">Get richest user</button>
</form>
<br>
<form method="post" action="sum">
    <input name="sum" type="text" size="10" value="${sum}" placeholder="Enter 'get'">
    <button type="submit">Get account sum</button>
</form>
</body>
</html>
