<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="login" class="com.DreamProject.Login"
             scope="session"></jsp:useBean>
<jsp:useBean id="builder" class="com.DreamProject.PageBuilder"
             scope="page"></jsp:useBean>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Historia Twoich zamówień</title>
</head>
<body style="background-color: #5d0569;">
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: rgb(255 255 255 / 30%);">
    <div class="container ">
        <a class="navbar-brand font-weight-bold text-white h1" href="index.jsp">Księgarnia "Dla Wybranych"</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active h5" aria-current="page" href="index.jsp">Strona Główna</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle h5" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                        Produkty
                    </a>
                    <ul class="dropdown-menu" aria-labelledby="navbarDropdown" style="background-color: #5d0569;">
                        <li><a class="dropdown-item text-white bg-hover" href="books.jsp">Książki</a></li>
                        <li><a class="dropdown-item text-white bg-hover" href="audiobooks.jsp">Audiobook</a></li>
                    </ul>
                </li>
                <%=builder.getWelcome(login) %>
            </ul>
            <form class="d-flex me-3">
                <input class="form-control me-2" type="search" placeholder="Wyszukiwarka" aria-label="Search">
                <button class="btn btn-success" type="submit">Wyszukaj</button>
            </form>
            <form class="d-flex">
                <button type="button" class="btn btn-primary">
                    <svg xmlns="http://www.w3.org/2000/svg" width="20" height="20" fill="currentColor" class="bi bi-cart" viewBox="0 0 16 16">
                        <path d="M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"></path>
                    </svg>
                    Koszyk
                </button>
            </form>

        </div>
    </div>

</nav>
<div class="container">
    <h1 class="text-center text-light">Twoje zamówienia:</h1>
    <%=builder.showOrderHistory(login)%>
</div>

</body>
</html>
