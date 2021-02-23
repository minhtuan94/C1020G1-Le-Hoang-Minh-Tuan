<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/02/2021
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Chang Money</h3>
<form action="/change" method="post">
    <input type="text" name="num1">
    <input type="hidden" name="num2" value="23000">
    <button type="submit">Convert</button>
</form>
</body>
</html>
