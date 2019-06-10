<%--
  Created by IntelliJ IDEA.
  User: Trung
  Date: 5/31/2019
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>CALCULATOR</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form method="post" action="/calculator">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First:</td>
                <td><input type="text" name="first"></td>
            </tr>
            <tr>
                <td>Operator: </td>
                <td>
                    <select name="operator">
                        <option value="+">ADD</option>
                        <option value="-">SUB</option>
                        <option value="*">MUL</option>
                        <option value="/">DIV</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second:</td>
                <td><input type="text" name="second"></td>
            </tr>
        </table>
    </fieldset>
    <input type="submit" value="Calculator">
</form>
</body>
</html>
