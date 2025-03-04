<%-- 
    Document   : index.jsp
    Created on : Jan 21, 2025, 1:40:26 PM
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Kiểm tra tam giác</title>
    </head>
    <body>
        <h1>Nhập 3 cạnh của tam giác: </h1>
        <form action="TriangleServlet" method="POST">
            Cạnh a: <input type="number" name="a" step="0.01" required><br>
            Cạnh b: <input type="number" name="b" step="0.01" required><br>
            Cạnh c: <input type="number" name="c" step="0.01" required><br><br>
            <input type="submit" value="Kiểm tra">
        </form>
    </body>
</html>
