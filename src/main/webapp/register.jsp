<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="com.DreamProject.User"
             scope="page"></jsp:useBean>
<jsp:useBean id="builder" class="com.DreamProject.PageBuilder"
             scope="page"></jsp:useBean>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Rejestracja</title>
</head>
<body style="background-color: #5d0569;">
<%--TODO zrobić auto przejście do innej strony gdy user zalogowany--%>
<div class="container">
    <div class="card w-50 mx-auto mt-4 text-light" style="background-color: rgb(255 255 255 / 30%);">
        <div class="card-body">
            <h2 class="text-center">Zarejestruj się!</h2>
            <form method="POST" action="<%= request.getContextPath() %>/register">
                <div class="mb-3">
                    <label for="name" class="form-label">Imię:</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Imię" required>
                </div>
                <div class="mb-3">
                    <label for="surname" class="form-label">Nazwisko:</label>
                    <input type="text" class="form-control" id="surname" name="surname" placeholder="Nazwisko" required>
                </div>
                <div class="mb-3">
                    <label for="email" class="form-label">Adres e-mail:</label>
                    <input type="email" class="form-control" id="email" name="email" placeholder="adres@email.pl" required>
                    <div id="emailHelp" class="form-text text-white">Nie udostępnimy twojego adresu e-mail nikomu więcej.</div>
                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Hasło:</label>
                    <input type="password" class="form-control" name="password" id="password">
                </div>
                <div class="mb-3 form-check">
                    <input type="checkbox" class="form-check-input" name="privacypolicy" id="privacypolicy" required>
                    <label class="form-check-label" for="privacypolicy">Zapoznałem się z zasadami prywatności</label>
                </div>
                <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                    <button type="submit" class="btn btn-success float-right">Zarejestruj się</button>
                </div>

            </form>
        </div>
    </div>
</div>

</body>
</html>
