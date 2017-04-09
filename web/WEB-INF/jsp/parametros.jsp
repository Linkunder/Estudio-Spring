<%-- 
    Document   : parametros
    Created on : 08-04-2017, 20:22:38
    Author     : Linkunder
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <%@ page isELIgnored="false" %>
        <title>Parámetros</title>
    </head>
    <body>
        <h1>Parámetros</h1>
        <ul>
            <li>ID = <c:out value="${id}" /></li>
        </ul>
    </body>
</html>
