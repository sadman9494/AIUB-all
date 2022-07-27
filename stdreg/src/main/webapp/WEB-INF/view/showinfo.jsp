<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 7/27/2022
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<html>
<head>
    <title>sakib</title>
<h1>
    all students
</h1>
    <c:forEach var="std" items="${student}">
        <h3> ${std}</h3>

    </c:forEach>

    <h1> Selected students</h1>

    <c:forEach var="std" items="${student}">
        <c:if test="${std.CGP>=3.9}">
            <h3> ${std}</h3>
        </c:if>


    </c:forEach>




</head>
<body>

</body>
</html>
