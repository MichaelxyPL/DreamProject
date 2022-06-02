<%--strona do obsługi logowania - brudnopis--%>

<%@ page import="com.DreamProject.User" %>
<%@ page import="com.DreamProject.MainDAO" %>
<jsp:useBean id="user" class="com.DreamProject.User"
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
