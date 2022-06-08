<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="builder" class="com.DreamProject.PageBuilder"
             scope="page"></jsp:useBean>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Zamówienie złożone pomyślnie!</title>
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
<header><%= builder.makeHeader() %></header>

<div class="container text-center" style="min-height: 300px;">
    <p class="text-white h1" style="margin-top: 10%">Dziękujemy za złożenie zamówienia.</p>
    <p class="text-white">Twoje zamówienie jest w drodze! Dziękujemy za zaufanie i życzymy przyjemnego czytania.</p>
</div>
<div class="u-clearfix u-gutter-20 u-layout-wrap u-layout-wrap-1">
    <div class="u-layout">
        <div class="u-layout-row">
            <%= builder.showProducts() %>
        </div>
    </div>
</div>

<footer class="text-center text-lg-start bg-pink text-white"><%= builder.getFooter() %></footer>
</body>
</html>