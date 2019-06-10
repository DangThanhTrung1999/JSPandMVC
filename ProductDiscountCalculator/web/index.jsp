<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/30/2019
  Time: 6:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form method="post" action="/result">
  <h1> Product Discount Calculator</h1>
  <label>Product Description:</label><br>
  <input type="text" size="20" name="productDescription"/><br>
  <label>List Price:</label><br>
  <input type="text" size="20" name="listPrice"/><br>
  <label>Discount Percent:</label><br>
  <input type="text" size="20" name="discountPercent"/><br>
  <input type="submit" value="Calculate Discount"/>
  </form>
  </body>
</html>
