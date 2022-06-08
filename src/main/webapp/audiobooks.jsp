<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <title>Audiobook</title>
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
<button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#order">
    Dodaj do koszyka
</button>
<div class="modal fade" id="order" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title text-center">Zamówienie</h4>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <form>
                <div class="modal-body">
                    <div class="mb-3 mt-3">
                        <label for="adres" class="form-label">Adres:</label>
                        <input type="text" class="form-control" id="adres" placeholder="Wprowadź adres" name="adres">
                    </div>
                    <div class="mb-3">
                        <label for="amount" class="form-label">Ilość:</label>
                        <input type="number" class="form-control" id="amount" name="amount" min="1" max="10" style="max-width: 65px;" value="1">
                    </div>
                    <div class="mb-3">
                        <label for="delivery" class="form-label">Sposób dostawy:</label>
                        <select class="form-select" aria-label="Default select example" id="delivery">
                            <option hidden>Wybierz sposób dostawy</option>
                            <option value="1">Pocztex</option>
                            <option value="2">InPost</option>
                            <option value="3">Krzysiek na rowerze</option>
                        </select>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="submit" class="btn btn-success" data-bs-dismiss="modal">Zapłać</button>
                </div>
            </form>
        </div>
    </div>
</div>

</body>
</html>
