<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>JSTL Demo
        <hr>
        <c:set var="name" value="Mr Z"></c:set>      
        <c:out value="${name}"></c:out><br>
        <a h="choose-student-page.jsp">Choose student</a><br>
        <a href="foreach-page.jsp">For-each page</a><br>
        <a href="if-student-page.jsp">If student</a><br>
        <a href="length-page.jsp">Length page</a><br>
        <a href="xoa.jsp">Discount page</a><br>ref
        </h1>
    </body>
</html>