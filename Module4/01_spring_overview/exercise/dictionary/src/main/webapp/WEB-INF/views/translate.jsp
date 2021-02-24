<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/02/2021
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>translate</title>
</head>
<body>
<form action="/showTrans">
    <input type="text" name="eng" value="${search}">
    <input type="submit" value="Translate">
</form>
<p>${result}</p>
</body>
</html>
