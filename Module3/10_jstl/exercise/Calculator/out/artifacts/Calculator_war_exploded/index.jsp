<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/01/2021
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Simple Calc</title>
  </head>
  <body>
  <form action="/calc" method="post">
  <fieldset>
    <legend>Calculator</legend>
    <table>
      <tr>
        <td>First operand:</td>
        <td><input type="text" name="firstOperand"></td>
      </tr>
      <tr>
        <td>Operator</td>
        <td>
          <select name="operator">
            <option value="+">Addition</option>
            <option value="-">Subtraction</option>
            <option value="*">Multiplication</option>
            <option value="/">Division</option>
          </select>
        </td>
      </tr>
      <tr>
        <td>Second operand:</td>
        <td><input type="text" name="secondOperand"></td>
      </tr>
      <tr>
        <td></td>
        <td><input type="submit" value="Calculate"></td>
      </tr>
    </table>
  </fieldset>
  </form>
  <%=request.getAttribute("finish")%>
  </body>
</html>
