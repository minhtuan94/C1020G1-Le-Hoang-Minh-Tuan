<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23/02/2021
  Time: 11:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>home</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/spice" method="post">
<input type="checkbox" name="condiment" value="Lettuce">Lettuce
<input type="checkbox" name="condiment" value="Tomato">Tomato
<input type="checkbox" name="condiment" value="Mustard">Mustard
<input type="checkbox" name="condiment" value="Sprouts">Sprouts
<hr>
<input type="submit" value="save">
</form>
</body>
</html>
