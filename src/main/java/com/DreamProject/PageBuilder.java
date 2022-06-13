package com.DreamProject;

import com.DreamProject.patternStrategy.ProductTempate;
import com.DreamProject.patternStrategy.TemplateAudiobook;
import com.DreamProject.patternStrategy.TemplateBook;

import java.util.List;

public class PageBuilder {
    public String makeHeader(){
        return "    <nav class=\"navbar navbar-expand-lg navbar-light\" style=\"background-color: rgb(255 255 255 / 30%);\">\n" +
                "        <div class=\"container \">\n" +
                "            <a class=\"navbar-brand font-weight-bold text-white h1\" href=\"index.jsp\">Księgarnia \"Dla Wybranych\"</a>\n" +
                "            <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
                "                <span class=\"navbar-toggler-icon\"></span>\n" +
                "            </button>\n" +
                "            <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
                "                <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
                "                    <li class=\"nav-item\">\n" +
                "                        <a class=\"nav-link active h5\" aria-current=\"page\" href=\"index.jsp\">Strona Główna</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item dropdown\">\n" +
                "                        <a class=\"nav-link dropdown-toggle h5\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n" +
                "                            Produkty\n" +
                "                        </a>\n" +
                "                        <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #5d0569;\">\n" +
                "                            <li><a class=\"dropdown-item text-white bg-hover\" href=\"index.jsp\">Książki</a></li>\n" +
                "                            <li><a class=\"dropdown-item text-white bg-hover\" href=\"index.jsp\">Audiobook</a></li>\n" +
                "                        </ul>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item h5\">\n" +
                "                        <a class=\"nav-link\" href=\"login.jsp\">Logowanie</a>\n" +
                "                    </li>\n" +
                "                    <li class=\"nav-item h5\">\n" +
                "                        <a class=\"nav-link\" href=\"register.jsp\">Rejestracja</a>\n" +
                "                    </li>\n" +
                "                </ul>\n" +
                "                <form class=\"d-flex me-3\">\n" +
                "                    <input class=\"form-control me-2\" type=\"search\" placeholder=\"Wyszukiwarka\" aria-label=\"Search\">\n" +
                "                    <button class=\"btn btn-success\" type=\"submit\">Wyszukaj</button>\n" +
                "                </form>\n" +
                "                <form class=\"d-flex\">\n" +
                "                    <button type=\"button\" class=\"btn btn-primary\">\n" +
                "                        <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"20\" height=\"20\" fill=\"currentColor\" class=\"bi bi-cart\" viewBox=\"0 0 16 16\">\n" +
                "                            <path d=\"M0 1.5A.5.5 0 0 1 .5 1H2a.5.5 0 0 1 .485.379L2.89 3H14.5a.5.5 0 0 1 .491.592l-1.5 8A.5.5 0 0 1 13 12H4a.5.5 0 0 1-.491-.408L2.01 3.607 1.61 2H.5a.5.5 0 0 1-.5-.5zM3.102 4l1.313 7h8.17l1.313-7H3.102zM5 12a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm7 0a2 2 0 1 0 0 4 2 2 0 0 0 0-4zm-7 1a1 1 0 1 1 0 2 1 1 0 0 1 0-2zm7 0a1 1 0 1 1 0 2 1 1 0 0 1 0-2z\"></path>\n" +
                "                        </svg>\n" +
                "                        Koszyk\n" +
                "                    </button>\n" +
                "                </form>\n" +
                "\n" +
                "            </div>\n" +
                "        </div>\n" +
                "\n" +
                "    </nav>";
               // this.makeCategoryHeader();
    }

    public String makeCategoryHeader(){
        return "<div class=\"container-fluid mb-5\">\n" +
                "  <div class=\"row border-top px-xl-5\">\n" +
                "    <div class=\"col-lg-3 d-none d-lg-block\"><a class=\"btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100\" data-toggle=\"collapse\"  style=\"height:65px;margin-top:-1px;padding:0 30px;\">\n" +
                "      <h1 class=\"m-0\">Kategorie</h1></a>\n" +
                "      <nav class=\"collapse show navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0\" id=\"navbar-vertical\">\n" +
                "        <div class=\"navbar-nav w-100 overflow-hidden\">\n" +
                "          <div class=\"nav-item dropdown\"><a class=\"nav-link\" data-toggle=\"dropdown\" href=\"index.jsp\">Książki </a>\n" +
                "          </div>\n" +
                "          <a class=\"nav-item nav-link\" href=\"index.jsp\">Audiobook</a></div>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "    <div class=\"col-lg-9\">\n" +
                "      <nav class=\"navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0\"><a class=\"text-decoration-none d-block d-lg-none\">\n" +
                "        <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-white font-weight-bold border-0 px-3 mr-1\">Księgarnia</span></h1>\n" +
                "        </a>\n" +
                "        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\"><span class=\"navbar-toggler-icon\"></span></button>\n" +
                "        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n" +
                "          <div class=\"navbar-nav mr-auto py-0\"><a class=\"nav-item nav-link active\">Home</a> <a class=\"nav-item nav-link\">Shop</a> <a class=\"nav-item nav-link\">Shop Detail</a>\n" +
                "            <div class=\"nav-item dropdown\"><a class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\">Pages</a>\n" +
                "              <div class=\"dropdown-menu rounded-0 m-0\"><a class=\"dropdown-item\">Shopping Cart</a> <a class=\"dropdown-item\">Checkout</a></div>\n" +
                "            </div>\n" +
                "            <a class=\"nav-item nav-link\">Contact</a></div>\n" +
                "          <div class=\"navbar-nav ml-auto py-0\"><a class=\"nav-item nav-link\" href=\"login.jsp\">Login</a> <a class=\"nav-item nav-link\" href=\"register.jsp\">Register</a></div>\n" +
                "        </div>\n" +
                "      </nav>\n" +
                "      <div id=\"header-carousel\" class=\"carousel slide\" data-ride=\"carousel\">\n" +
                "        <div class=\"carousel-inner\">\n" +
                "          <div class=\"carousel-item\" style=\"height:410px;\"><img class=\"img-fluid\" src=\"assets/img/carousel-1.jpg\" alt=\"website template image\">\n" +
                "            <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n" +
                "              <div class=\"p-3\" style=\"max-width:700px;\">\n" +
                "                <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First Order</h4>\n" +
                "                <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Fashionable Dress</h3>\n" +
                "                <a class=\"btn btn-light py-2 px-3\">Shop Now</a></div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"carousel-item active\" style=\"height:410px;\"><img class=\"img-fluid\" src=\"assets/img/carousel-2.jpg\" alt=\"website template image\">\n" +
                "            <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n" +
                "              <div class=\"p-3\" style=\"max-width:700px;\">\n" +
                "                <h4 class=\"text-light text-uppercase font-weight-medium mb-3\">10% Off Your First Order</h4>\n" +
                "                <h3 class=\"display-4 text-white font-weight-semi-bold mb-4\">Reasonable Price</h3>\n" +
                "                <a class=\"btn btn-light py-2 px-3\">Shop Now</a></div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <a class=\"carousel-control-prev\"  data-slide=\"prev\">\n" +
                "        <div class=\"btn btn-dark\" style=\"width:45px;height:45px;\"><span class=\"carousel-control-prev-icon mb-n2\"></span></div>\n" +
                "        </a> <a class=\"carousel-control-next\" data-slide=\"next\">\n" +
                "        <div class=\"btn btn-dark\" style=\"width:45px;height:45px;\"><span class=\"carousel-control-next-icon mb-n2\"></span></div>\n" +
                "        </a></div>\n" +
                "    </div>\n" +
                "  </div>\n" +
                "</div>";
    }

    public String getFooter(){
        return  "<section class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom container\">\n" +
                "            <div class=\"me-5 d-none d-lg-block\">\n" +
                "                <span>Znajdź nas w sieci:</span>\n" +
                "            </div>\n" +
                "            <div>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-facebook\"></i>\n" +
                "                </a>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-twitter\"></i>\n" +
                "                </a>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-google\"></i>\n" +
                "                </a>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-instagram\"></i>\n" +
                "                </a>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-linkedin\"></i>\n" +
                "                </a>\n" +
                "                <a href=\"\" class=\"me-4 text-reset\">\n" +
                "                    <i class=\"bi bi-github\"></i>\n" +
                "                </a>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <section class=\"\">\n" +
                "            <div class=\"container text-center text-md-start mt-5\">\n" +
                "                <div class=\"row mt-3\">\n" +
                "                    <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n" +
                "                        <h6 class=\"text-uppercase fw-bold mb-4\">\n" +
                "                            <i class=\"fas fa-gem me-3\"></i>Księgarnia \"Dla Wybranych\"\n" +
                "                        </h6>\n" +
                "                        <p>\n" +
                "                            Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras in fringilla purus, et pretium ante. Ut consequat ante quis mollis maximus. Mauris vitae nibh non neque varius interdum vel accumsan ipsum.\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "\n" +
                "                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto mb-4\">\n" +
                "                        <h6 class=\"text-uppercase fw-bold mb-4\">\n" +
                "                            Produkty\n" +
                "                        </h6>\n" +
                "                        <p>\n" +
                "                            <a href=\"index.jsp\" class=\"text-reset\">Książki</a>\n" +
                "                        </p>\n" +
                "                        <p>\n" +
                "                            <a href=\"index.jsp\" class=\"text-reset\">Audiobooki</a>\n" +
                "                        </p>\n" +
                "                    </div>\n" +
                "\n" +
                "                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n" +
                "                        <h6 class=\"text-uppercase fw-bold mb-4\">\n" +
                "                            Przydatne linki\n" +
                "                        </h6>\n" +
                "                        <p>\n" +
                "                            <a href=\"index.jsp\" class=\"text-reset\">Strona Główna</a>\n" +
                "                        </p>\n" +
                "                        <p>\n" +
                "                            <a href=\"login.jsp\" class=\"text-reset\">Logowanie</a>\n" +
                "                        </p>\n" +
                "                        <p>\n" +
                "                            <a href=\"register.jsp\" class=\"text-reset\">Rejestracja</a>\n" +
                "                        </p>\n" +
                "\n" +
                "                    </div>\n" +
                "                    <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n" +
                "                        <h6 class=\"text-uppercase fw-bold mb-4\">\n" +
                "                            Kontakt\n" +
                "                        </h6>\n" +
                "                        <p><i class=\"fas fa-home me-3\"></i>Łabiszyńska 25, 03-204 Warszawa</p>\n" +
                "                        <p>\n" +
                "                            <i class=\"fas fa-envelope me-3\"></i>\n" +
                "                            ksiegarnia@dlaWybranych.pl\n" +
                "                        </p>\n" +
                "                        <p><i class=\"fas fa-phone me-3\"></i> +48 234 567 88</p>\n" +
                "                        <p><i class=\"fas fa-print me-3\"></i> +48 234 567 89</p>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "        </section>\n" +
                "        <div class=\"text-center p-4\" style=\"background-color: rgba(0, 0, 0, 0.05);\">\n" +
                "            <p>© 2022 Copyright:</p>\n" +
                "            <a class=\"text-reset fw-bold\" href=\"#\">Dawid Kwietniewski, Krzysztof Sepski, Michał Szerzeń, Katarzyna Walczak</a>\n" +
                "        </div>\n";
    }

    public String showProducts() {
        MainDAO db=new MainDAO();
        List<Book> books=db.getBooks();
        String productSet = "";

        for(Book book : books)
        {
            if(book.getType().equals("book")){
                ProductTempate template=new TemplateBook();
                productSet+= template.showProductBox(book);
            }else if(book.getType().equals("audiobook")){
                ProductTempate template=new TemplateAudiobook();
                productSet+= template.showProductBox(book);
            }
        }
        productSet+=this.formOrder("/addOrder");

        return productSet;
//        return "aaaaaaaaa";
    }

    public String getWelcome(Login login) {
        if(login.checkIsLogged()){
            return "Witaj, "+login.getName();
        }else {
            return "<li class=\"nav-item h5\">\n" +
                    "                        <a class=\"nav-link\" href=\"login.jsp\">Logowanie</a>\n" +
                    "                    </li>\n" +
                    "                    <li class=\"nav-item h5\">\n" +
                    "                        <a class=\"nav-link\" href=\"register.jsp\">Rejestracja</a>\n" +
                    "                    </li>";
        }
    }

    public String showError(Login login) {
        if(login.checkIsFailed()){
            return "<div style=\"width:15em;background: rgb(255 255 255 / 60%);\"><i class=\"bi bi-heartbreak\"></i> Spróbuj jeszcze raz</div>";
        }
        return "";
    }

    public String formOrder(String actionSrc) {
        return  "<div class=\"modal fade\" id=\"order\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n" +
                "    <div class=\"modal-dialog\">\n" +
                "        <div class=\"modal-content\">\n" +
                "            <div class=\"modal-header\">\n" +
                "                <h4 class=\"modal-title text-center\">Zamówienie</h4>\n" +
                "                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n" +
                "            </div>\n" +
                "            <form method=\"POST\" action=\"" + actionSrc + "\">\n" +
                "                <div class=\"modal-body\">\n" +
                "                    <div class=\"mb-3 mt-3\">\n" +
                "                        <label for=\"address\" class=\"form-label\">Adres:</label>\n" +
                "                        <input type=\"text\" class=\"form-control\" id=\"address\" placeholder=\"Wprowadź adres\" name=\"address\">\n" +
                "                    </div>\n" +
                "                    <div style=\"display:none\" class=\"mb-3 mt-3\">\n" +
                "                        <label for=\"bookid\" class=\"form-label\">bookid:</label>\n" +
                "                        <input type=\"text\" class=\"form-control\" id=\"bookid\" placeholder=\"bookid\" name=\"bookid\">\n" +
                "                    </div>\n" +
                "                    <div class=\"mb-3\">\n" +
                "                        <label for=\"amount\" class=\"form-label\">Ilość:</label>\n" +
                "                        <input type=\"number\" class=\"form-control\" id=\"amount\" name=\"amount\" min=\"1\" max=\"10\" style=\"max-width: 65px;\" value=\"1\">\n" +
                "                    </div>\n" +
                "                    <div class=\"mb-3\">\n" +
                "                        <label for=\"delivery\" class=\"form-label\">Sposób dostawy:</label>\n" +
                "                        <select class=\"form-select\" aria-label=\"Default select example\" id=\"delivery\">\n" +
                "                            <option hidden>Wybierz sposób dostawy</option>\n" +
                "                            <option value=\"1\">Pocztex</option>\n" +
                "                            <option value=\"2\">InPost</option>\n" +
                "                            <option value=\"3\">Krzysiek na rowerze</option>\n" +
                "                        </select>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "                <div class=\"modal-footer\">\n" +
                "                    <button type=\"submit\" class=\"btn btn-success\" data-bs-dismiss=\"modal\">Zapłać</button>\n" +
                "                </div>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "    </div>\n" +
                "</div>";
    }

    public Object showOrderHistory(Login login) {
        MainDAO db=new MainDAO();
        List<Order> orders=db.getOrdersHistory(login);
        String historySet = "";

        for(Order order : orders) {
            historySet+="<tr>\n" +
                "            <td>"+order.getDate()+"</td>\n" +
                "            <td>"+order.getProductID()+"<td>\n" +
                "            <td>"+order.getAmount()+"</td>\n" +
                "        </tr>";
        }

        return "<table class=\"mt-4 table table-light table-striped\">\n" +
                "        <thead>\n" +
                "        <tr>\n" +
                "            <th scope=\"col\">Data zamówienia</th>\n" +
                "            <th scope=\"col\">Produkt</th>\n" +
                "            <th scope=\"col\">Ilość</th>\n" +
                "        </tr>\n" +
                "        </thead>\n" +
                "        <tbody>\n" +
                    historySet+
                "        </tbody>\n" +
                "    </table>";
    }
}

