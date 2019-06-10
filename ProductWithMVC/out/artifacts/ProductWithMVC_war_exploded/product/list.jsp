<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 6/5/2019
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Product</title>
</head>
<body>
<h1>Products</h1>
<a href="/logout">Logout</a><br>
<a href="/products?action=create">Create new Customer</a>
<table border="1">
<tr>
    <td>Name</td>
    <td>Price</td>
    <td>Describe</td>
    <td>Producer</td>
    <td>Edit</td>
    <td>Delete</td>
</tr>

   <c:forEach items="${products}" var="product">
       <tr>
       <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
       <td>${product.getPrice()}</td>
       <td>${product.getDescribe()}</td>
       <td>${product.getProducer()}</td>
       <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
       <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
       </tr>
   </c:forEach>
</table>
<form method="post" action="/products?action=search">
    <label>Find product</label>
    <input type="text" name="search">
    <input type="submit" value="Find">
</form>
</body>
</html>
