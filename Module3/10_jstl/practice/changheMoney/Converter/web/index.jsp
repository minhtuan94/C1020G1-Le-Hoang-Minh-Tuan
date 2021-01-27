<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/01/2021
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Converter</title>
  </head>
  <body>
  <h2>Currency Converter</h2>
  <form action="/converter" method="post" target="_blank">
    <label>Rate: </label><br>
    <input type="text" name="rate" value="23000"><br>
    <br>
    <label>usd:</label><br>
    <input type="text" name="usd" placeholder="input usd"><br>
    <input type="submit" name="submit" value="Converter" style="padding: 5px;border-style: outset">
  </form>
  </body>
</html>
