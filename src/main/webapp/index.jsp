<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Projekt</title>
</head>
<body>
<h1>Hejo</h1>
<br/>
<%--<form method="post" action="login.jsp">--%>
<form method="post" action="pracownik.jsp">
    Podaj swój login: <br />
    <input type="text" name="name" /><br />
    Podaj swoje hasło: <br />
    <input type="text" name="password" /><br />
    <input type="submit" value="zaloguj">
</form>
</body>
</html>