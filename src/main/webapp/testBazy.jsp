<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dbc" class="com.example.DreamProjct.MainDAO"
             scope="session"></jsp:useBean>

<!-- Wyświetlenie nazwy użytkownika. -->
Użytkownicy: <%= dbc.geUsers() %><br />

<%--
<% String result = "Dane niepoprawne";

    if(dataSource.userExists(user)) {
        result = "Poprawny użytkownik oraz hasło";
    }
%>
--%>

</body>