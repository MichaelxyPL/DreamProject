<%--<%@ page import="java.sql.ResultSet" %>--%>
<%@ page import="com.example.DreamProjct.MainDAO" %>
<%@ page import="com.example.DreamProjct.SQLParser" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Strona główna</title>
</head>
<body>
<h1>Panel główny</h1>
<a href="/product.jsp">link</a>
<jsp:useBean id="user" class="com.example.DreamProjct.User"
             scope="session"/>
<jsp:setProperty property="*" name="user" />
    <%=request.getParameter("name")%>

