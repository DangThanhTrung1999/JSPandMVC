<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 6/5/2019
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<form method="post" action="/login">
    <h2>Login</h2>
    <input type="text" name="username" size="30" placeholder="username"/>
    <br>
    <input type="text" name="password" size="30" placeholder="password"/>
    <br><br>
    <input type="submit" value="Sign in"/>
</form>
</body>
</html>
