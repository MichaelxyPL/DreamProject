package com.DreamProject;

import java.util.List;

public class PageBuilder {
    public String makeHeader(){
        return "<div class=\"container-fluid\">\n" +
                "    <div class=\"row align-items-center py-3 px-xl-5\">\n" +
                "        <div class=\"col-lg-3 d-none d-lg-block\"><a class=\"text-decoration-none\">\n" +
                "            <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">Księgarnia</span>Zajebista</h1>\n" +
                "        </a></div>\n" +
                "        <div class=\"col-lg-6 col-6 text-left\">\n" +
                "            <form action=\"#\" method=\"post\">\n" +
                "                <div class=\"input-group\">\n" +
                "                    <input type=\"text\" class=\"form-control\" placeholder=\"Search for products\">\n" +
                "                    <div class=\"input-group-append\"><span class=\"input-group-text bg-transparent text-primary\"><i class=\"fa fa-search\"></i></span></div>\n" +
                "                </div>\n" +
                "            </form>\n" +
                "        </div>\n" +
                "        <div class=\"col-lg-3 col-6 text-right\"> <a class=\"btn border\" href=\"cart.jsp\"><i class=\"fa fa-shopping-cart text-primary\"></i> <span class=\"badge\">0</span></a></div>\n" +
                "    </div>\n" +
                "</div>"+
                this.makeCategoryHeader();
    }

    public String makeCategoryHeader(){
        return "<div class=\"container-fluid mb-5\">\n" +
                "  <div class=\"row border-top px-xl-5\">\n" +
                "    <div class=\"col-lg-3 d-none d-lg-block\"><a class=\"btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100\" data-toggle=\"collapse\"  style=\"height:65px;margin-top:-1px;padding:0 30px;\">\n" +
                "      <h6 class=\"m-0\">Categories</h6>\n" +
                "      <i class=\"fa fa-angle-down text-dark\"></i></a>\n" +
                "      <nav class=\"collapse show navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0\" id=\"navbar-vertical\">\n" +
                "        <div class=\"navbar-nav w-100 overflow-hidden\" style=\"height:123px\">\n" +
                "          <div class=\"nav-item dropdown\"><a class=\"nav-link\" data-toggle=\"dropdown\" href=\"dresses.jsp\">Dresses </a>\n" +
                "          </div>\n" +
                "          <a class=\"nav-item nav-link\" href=\"shirts.jsp\">Shirts</a> <a class=\"nav-item nav-link\" href=\"jeans.jsp\">Jeans</a> 0</div>\n" +
                "      </nav>\n" +
                "    </div>\n" +
                "    <div class=\"col-lg-9\">\n" +
                "      <nav class=\"navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0\"><a class=\"text-decoration-none d-block d-lg-none\">\n" +
                "        <h1 class=\"m-0 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border px-3 mr-1\">Księgarnia</span>Zajebista</h1>\n" +
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

    private String showProduct(Book book){
        return "<div class=\"u-container-style u-expand-resize u-layout-cell u-size-20 u-size-20-md u-layout-cell-2\">\n" +
                "                <div class=\"u-container-layout u-container-layout-3\">\n" +
                "                    <img class=\"u-image u-image-2\" src=\""+book.getImg()+"\"></img>\n" +
                "                    <h4 class=\"u-align-center u-text u-text-custom-color-2 u-text-5\">\n" +
                "                        <br>"+book.getName()+"\n" +
                "                    </h4>\n" +
                "                    <p class=\"u-align-center u-text u-text-6\">"+book.getPrice()+"</p>\n" +
                "                </div>\n" +
                "            </div>";
    }

    public String getFooter(){
        return "<div class=\"container-fluid bg-secondary text-dark mt-5 pt-5\">\n" +
                "      <div class=\"row px-xl-5 pt-5\">\n" +
                "        <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\"><a class=\"text-decoration-none\">\n" +
                "          <h1 class=\"mb-4 display-5 font-weight-semi-bold\"><span class=\"text-primary font-weight-bold border border-white px-3 mr-1\">Księgarnia</span>Zajebista</h1>\n" +
                "          </a>\n" +
                "          <p>Bo kochamy książki. I wasze pieniądze &lt;3</p>\n" +
                "          <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>Kwiatowa 2137, Warszawa</p>\n" +
                "          \n" +
                "          \n" +
                "        </div>\n" +
                "        <div class=\"col-lg-8 col-md-12\">\n" +
                "          <div class=\"row\">\n" +
                "            <div class=\"col-md-4 mb-5\">\n" +
                "              <h5 class=\"font-weight-bold text-dark mb-4\">Na skróty</h5>\n" +
                "              <div class=\"d-flex flex-column justify-content-start\"><a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Home</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a> <a class=\"text-dark\" ><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a></div>\n" +
                "            </div>\n" +
                "            <div class=\"col-md-4 mb-5\">\n" +
                "              <h5 class=\"font-weight-bold text-dark mb-4\">Quick Links</h5>\n" +
                "              <div class=\"d-flex flex-column justify-content-start\"><a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Home</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Our Shop</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Shop Detail</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Shopping Cart</a> <a class=\"text-dark mb-2\" ><i class=\"fa fa-angle-right mr-2\"></i>Checkout</a> <a class=\"text-dark\" ><i class=\"fa fa-angle-right mr-2\"></i>Contact Us</a></div>\n" +
                "            </div>\n" +
                "            <div class=\"col-md-4 mb-5\">\n" +
                "              <h5 class=\"font-weight-bold text-dark mb-4\">Newsletter</h5>\n" +
                "              <form action=\"#\" method=\"post\">\n" +
                "                <div class=\"form-group\">\n" +
                "                  <input type=\"text\" class=\"form-control border-0 py-4\" placeholder=\"Your Name\" required=\"\">\n" +
                "                </div>\n" +
                "                <div class=\"form-group\">\n" +
                "                  <input type=\"email\" class=\"form-control border-0 py-4\" placeholder=\"Your Email\" required=\"\">\n" +
                "                </div>\n" +
                "                <div>\n" +
                "                  <button class=\"btn btn-primary btn-block border-0 py-3\" type=\"submit\">Subscribe Now</button>\n" +
                "                </div>\n" +
                "              </form>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "      <div class=\"row border-top border-light mx-xl-5 py-4\">\n" +
                "        <div class=\"col-md-6 px-xl-0\">\n" +
                "          <p class=\"mb-md-0 text-center text-md-left text-dark\">© <a class=\"text-dark font-weight-semi-bold\" >WSB Warszawa</a>. All Rights Reserved. Designed by <a class=\"text-dark font-weight-semi-bold\" target=\"_blank\" rel=\"nofollow noopener\" >Dawid Kwietniewski, Krzysztof Sepski, Michał Szerzeń, Katarzyna Walczak</a></p>\n" +
                "        </div>\n" +
                "        <div class=\"col-md-6 px-xl-0 text-center text-md-right\"><img class=\"img-fluid\" src=\"assets/img/payments.png\" alt=\"website template image\"></div>\n" +
                "      </div>\n" +
                "    </div>";
    }

    public String showProducts() {
        MainDAO db=new MainDAO();
        List<Book> books=db.getBooks();
        String productSet = "";

        for(Book book : books) {
            productSet+=this.showProduct(book);
        }

        return productSet;
//        return "aaaaaaaaa";
    }
}
