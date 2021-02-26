<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/02/2021
  Time: 14:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>calc</title>
</head>
<body>
<h1>Calculator</h1>
<form action="/calculator" method="post">
    <input type="number" name="a">
    <input type="number" name="b"><br>
    <input type="submit" name="calc" value="Addition(+)">
    <input type="submit" name="calc" value="Subtraction(-)">
    <input type="submit" name="calc" value="Multiplication(X)">
    <input type="submit" name="calc" value="Division(/)">
</form>
<p>${kq}</p>
</body>
</html>
