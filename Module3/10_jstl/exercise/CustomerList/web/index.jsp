<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 25/01/2021
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>CustomerList</title>
  </head>
  <body>
  <h1>Danh sách khách hàng</h1>
  <table border="1" cellspacing="0">
    <tr>
      <th>Tên</th>
      <th>Ngày sinh</th>
      <th>Địa chỉ</th>
      <th>Ảnh</th>
    </tr>
    <hr>
    <c:forEach var="customer" items="${customerListFromServlet}">
      <tr>
        <td><c:out value="${customer.name}"/></td>
        <td><c:out value="${customer.dob}"/></td>
        <td><c:out value="${customer.address}"/></td>
        <td><img src="${customer.img}" width="50px" height="50px"/></td>
      </tr>
    </c:forEach>
  </table>
  </body>
</html>
