<%--
  Created by IntelliJ IDEA.
  User: micha
  Date: 12.04.2022
  Time: 20:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Zamówienia</title>
</head>
<body>
    <div class="container text-white" style="background-color: #5d0569;">
        <div class="row pt-4 mb-4">
            <div class="col-md-8 pt-3 rounded" style="background-color: rgb(255 255 255 / 30%);">
                <div class="card bg-transparent border-0">
                    <div class="row">
                        <div class="col-md-4 mb-4">
                            <img src="https://cdn.bonito.pl/zdjecia/3/4d763a-kod-leonarda-da-vinci.jpg" class="img-thumbnail" alt="...">
                        </div>
                        <div class="col-md-8">
                            <div class="card-body">
                                <h1 class="card-title">Gate</h1>
                                <p class="card-text">Autor: Janusz Leon Wiśniewski</p>
                                <p class="card-text">Donec nec finibus purus, quis varius turpis. Phasellus sollicitudin in turpis eu blandit. Pellentesque justo ipsum, maximus et magna a, lacinia fringilla metus. Fusce pulvinar lacus quam, ac venenatis elit egestas non. Curabitur eu placerat lorem, vulputate maximus odio. Proin viverra nibh eros, sed rhoncus ligula consectetur ac. Nunc rhoncus justo tellus, sit amet scelerisque elit lacinia eu. Phasellus sed ex nec ligula aliquet condimentum sed sit amet nisi. Integer at nunc pulvinar, ultrices orci in, vulputate diam. Aliquam tempus, mauris ac auctor molestie, odio nibh finibus metus, quis venenatis tellus leo at lacus.</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <h1>36,99 zł</h1>
                <form class="g-3">
                    <div class="mt-4">
                        <button class="btn btn-success" type="submit">Pobierz</button>
                    </div>
                </form>
                <h2>Dostępne Online!</h2>
                <button type="button" class="btn btn-light mt-3">Zapytaj o dostęp!</button>
            </div>
        </div>
    </div>
</body>
</html>
