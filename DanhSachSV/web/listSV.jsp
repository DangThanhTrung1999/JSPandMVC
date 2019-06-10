<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/31/2019
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<html>
<head>
    <%--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">--%>
    <title>Title</title>
</head>
<body style="margin:0 auto; width:1024px">
<h1>Danh sách sinh viên</h1>
<%!

%>
<table width="100%" border="1" cellpadding="1" cellspacing="1">
    <tr>
        <th width="10%">Mã SV</th>
        <th width="50%">Tên SV</th>
    </tr>
    <c:forEach items="${list}" var="objSV">
        <tr>
            <td>${objSV.id }</td>
            <td>${objSV.name }</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
