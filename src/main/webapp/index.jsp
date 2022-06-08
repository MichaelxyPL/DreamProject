<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="user" class="com.DreamProject.User"
             scope="page"></jsp:useBean>
<jsp:useBean id="builder" class="com.DreamProject.PageBuilder"
             scope="page"></jsp:useBean>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Księgarnia "Dla Wybranych"</title>
    <style>
        .bg-hover:hover{
            background-color: rgb(255 255 255 / 30%)!important;
        }
        .bg-pink{
            background-color: rgb(255 255 255 / 30%);
        }
        .carousel-item,.carousel-inner{
            max-height: 400px;
        }
        .carousel-caption{
            color: #ffffff;
            font-weight: bold;
            background-color: rgba(0, 0, 0, 0.50);
        }
    </style>
</head>
<body style="background-color: #5d0569;">
<%--Test działania zapisu objektu w sesji--%>
Witaj <%= user.getName()%>
    <nav class="navbar navbar-expand-lg navbar-light" style="background-color: rgb(255 255 255 / 30%);">
        <div class="container ">
            <a class="navbar-brand font-weight-bold text-white h1" href="#">Księgarnia "Dla Wybranych"</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active h5" aria-current="page" href="#">Strona Główna</a>
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
                    <li class="nav-item h5">
                        <a class="nav-link" href="login.jsp">Logowanie</a>
                    </li>
                    <li class="nav-item h5">
                        <a class="nav-link" href="register.jsp">Rejestracja</a>
                    </li>
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
        <div id="demo" class="carousel slide" data-bs-ride="carousel">
            <div class="carousel-indicators">
                <button type="button" data-bs-target="#demo" data-bs-slide-to="0" class="active"></button>
                <button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
                <button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
            </div>
            <div class="carousel-inner">
                <div class="carousel-item active">
                    <img src="https://d-art.ppstatic.pl/kadry/k/r/df/fb/610251f596d6d_o_full.jpg" alt="Los Angeles" class="d-block" style="width:100%">
                    <div class="carousel-caption">
                        <h3>Witaj w księgarni "Dla Wybranych"</h3>
                        <p>Książka czy Audiobook?</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://media.istockphoto.com/photos/books-stacked-on-table-at-bookstore-picture-id120004828?k=20&m=120004828&s=612x612&w=0&h=3Id1rv7HDuCY4aOIas4SGK3yJ_3uJoTQPE35B8i3kwE=" alt="Chicago" class="d-block" style="width:100%">
                    <div class="carousel-caption">
                        <h3>Książki</h3>
                        <p>Szeroki wybór książek dostępnych od ręki!</p>
                    </div>
                </div>
                <div class="carousel-item">
                    <img src="https://media.istockphoto.com/photos/audiobooks-concept-picture-id1285965933?b=1&k=20&m=1285965933&s=170667a&w=0&h=J7zoMTM4nsooAQRSU8MrxziEjW6goMjof4sji08Gp3c=" alt="New York" class="d-block" style="width:100%">
                    <div class="carousel-caption">
                        <h3>Audiobooki</h3>
                        <p>Pobierz interesującą Cię opowieść!</p>
                    </div>
                </div>
            </div>
            <button class="carousel-control-prev" type="button" data-bs-target="#demo" data-bs-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </button>
            <button class="carousel-control-next" type="button" data-bs-target="#demo" data-bs-slide="next">
                <span class="carousel-control-next-icon"></span>
            </button>
        </div>
    </div>
    <div class="container">
<%--TODO        Treść strony--%>
    </div>
    <footer class="text-center text-lg-start bg-pink text-white fixed-bottom">
        <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom container">
            <div class="me-5 d-none d-lg-block">
                <span>Znajdź nas w sieci:</span>
            </div>
            <div>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-facebook"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-twitter"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-google"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-instagram"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-linkedin"></i>
                </a>
                <a href="" class="me-4 text-reset">
                    <i class="bi bi-github"></i>
                </a>
            </div>
        </section>
        <section class="">
            <div class="container text-center text-md-start mt-5">
                <div class="row mt-3">
                    <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                        <h6 class="text-uppercase fw-bold mb-4">
                            <i class="fas fa-gem me-3"></i>Księgarnia "Dla Wybranych"
                        </h6>
                        <p>
                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in fringilla purus, et pretium ante. Ut consequat ante quis mollis maximus. Mauris vitae nibh non neque varius interdum vel accumsan ipsum.
                        </p>
                    </div>

                    <div class="col-md-2 col-lg-2 col-xl-2 mx-auto mb-4">
                        <h6 class="text-uppercase fw-bold mb-4">
                            Produkty
                        </h6>
                        <p>
                            <a href="books.jsp" class="text-reset">Książki</a>
                        </p>
                        <p>
                            <a href="audiobooks.jsp" class="text-reset">Audiobooki</a>
                        </p>
                    </div>

                    <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                        <h6 class="text-uppercase fw-bold mb-4">
                            Przydatne linki
                        </h6>
                        <p>
                            <a href="index.jsp" class="text-reset">Strona Główna</a>
                        </p>
                        <p>
                            <a href="login.jsp" class="text-reset">Logowanie</a>
                        </p>
                        <p>
                            <a href="register.jsp" class="text-reset">Rejestracja</a>
                        </p>

                    </div>
                    <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                        <h6 class="text-uppercase fw-bold mb-4">
                            Kontakt
                        </h6>
                        <p><i class="fas fa-home me-3"></i>Łabiszyńska 25, 03-204 Warszawa</p>
                        <p>
                            <i class="fas fa-envelope me-3"></i>
                            ksiegarnia@dlaWybranych.pl
                        </p>
                        <p><i class="fas fa-phone me-3"></i> +48 234 567 88</p>
                        <p><i class="fas fa-print me-3"></i> +48 234 567 89</p>
                    </div>
                </div>
            </div>
        </section>
        <div class="text-center p-4" style="background-color: rgba(0, 0, 0, 0.05);">
            <p>© 2022 Copyright:</p>
            <a class="text-reset fw-bold" href="#">Dawid Kwietniewski, Krzysztof Sepski, Michał Szerzeń, Katarzyna Walczak</a>
        </div>
    </footer>

</body>
</html>
