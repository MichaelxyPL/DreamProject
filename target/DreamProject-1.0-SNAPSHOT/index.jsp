<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:useBean id="builder" class="com.DreamProject.PageBuilder"
             scope="page"></jsp:useBean>
<jsp:useBean id="login" class="com.DreamProject.Login"
             scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="login" />
<jsp:useBean id="user" class="com.DreamProject.User"
             scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
    <title>Księgarnia</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/plugins.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>

<%
    if(!user.isLogged() && login.getName()!=null){
        user.validate(login);
    }
%>

<%= builder.makeHeader() %>



<%= builder.getFooter() %>
</body>
</html>

