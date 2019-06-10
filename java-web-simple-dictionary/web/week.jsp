<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/22/2019
  Time: 7:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.HashMap" %>
<html>
<head>
    <title>Week</title>
</head>
<body>
<%!
 Map<Integer,String> week= new HashMap<>();
%>
<%
    week.put(2,"Thứ 2");
    week.put(3,"Thứ 3");
    week.put(4,"Thứ 4");
    week.put(5,"Thứ 5");
    week.put(6,"Thứ 6");
    week.put(7,"Thứ 7");
    week.put(8,"Chủ nhật");
    String search= request.getParameter("week");
    int i= Integer.parseInt(search);
    String result= week.get(i);
    if(result!=null){
        out.println("Search: "+i);
        out.println("Result: "+result);
    }else{
        out.println("Not found");
    }
%>
</body>
</html>
