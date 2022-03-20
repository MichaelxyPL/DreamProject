<%@ page import="com.example.DreamProjct.User" %>
<%@ page import="com.example.DreamProjct.MainDAO" %>
<jsp:useBean id="user" class="com.example.DreamProjct.User"
             scope="session"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    MainDAO db=new MainDAO();

    db.setUser(user, request.getParameter("name"), request.getParameter("pswrd"));
if(user.isLogged()){ %>
    <jsp:forward page="pracownik.jsp">
    <jsp:param name="user" value="Chaitanya" />
<%}else{%>
    <jsp:forward page="index.jsp">
<jsp:param name="user" value="Chaitanya" />
    <%}
%>
