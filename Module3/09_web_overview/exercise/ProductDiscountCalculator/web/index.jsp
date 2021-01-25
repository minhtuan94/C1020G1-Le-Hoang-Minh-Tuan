<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 22/01/2021
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>ProductDiscountCalculator</title>
  </head>
  <body>
  <h2>Product Discount Calculator</h2>
  <form action="/discount" method="post">
    <table>
      <tr>
        <td><label>Product Description: </label></td><td><input type="text" name="ProductDescription" placeholder="Product Description"></td>
      </tr>
      <tr>
        <td><label>List Price</label></td><td><input type="text" name="ListPrice" placeholder="List Price"></td>
      </tr>
      <tr>
        <td><label>Discount Percent</label></td><td><input type="text" name="Discount" placeholder="Discount Percent"></td>
      </tr>
      <tr>
        <td><input type = "submit" id = "submit" value = "Calculate Discount"/></td><td></td>
      </tr>
    </table>
  </form>
  </body>
</html>
