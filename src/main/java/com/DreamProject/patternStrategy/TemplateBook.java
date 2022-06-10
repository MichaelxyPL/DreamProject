package com.DreamProject.patternStrategy;

import com.DreamProject.Book;

public class TemplateBook implements ProductTempate {

    @Override
    public String showProductBox(Book book){
        return "<div class=\"u-layout-row\">\n" +
                "                <div class=\"container text-white\" style=\"background-color: #5d0569;\">\n" +
                "        <div class=\"row pt-4 mb-4\">\n" +
                "            <div class=\"col-md-8 pt-3 rounded\" style=\"background-color: rgb(255 255 255 / 30%);\">\n" +
                "                <div class=\"card bg-transparent border-0\">\n" +
                "                    <div class=\"row\">\n" +
                "                        <div class=\"col-md-4 mb-4\">\n" +
                "                            <img src=\"https://cdn.bonito.pl/zdjecia/3/4d763a-kod-leonarda-da-vinci.jpg\" class=\"img-thumbnail\" alt=\"...\">\n" +
                "                        </div>\n" +
                "                        <div class=\"col-md-8\">\n" +
                "                            <div class=\"card-body\">\n" +
                "                                <h1 class=\"card-title\">"+book.getName()+"</h1>\n" +
                "                                <p class=\"card-text\">Autor: "+book.getAuthor()+"</p>\n" +
                "                                <p class=\"card-text\">Donec nec finibus purus, quis varius turpis. Phasellus sollicitudin in turpis eu blandit. Pellentesque justo ipsum, maximus et magna a, lacinia fringilla metus. Fusce pulvinar lacus quam, ac venenatis elit egestas non. Curabitur eu placerat lorem, vulputate maximus odio. Proin viverra nibh eros, sed rhoncus ligula consectetur ac. Nunc rhoncus justo tellus, sit amet scelerisque elit lacinia eu. Phasellus sed ex nec ligula aliquet condimentum sed sit amet nisi. Integer at nunc pulvinar, ultrices orci in, vulputate diam. Aliquam tempus, mauris ac auctor molestie, odio nibh finibus metus, quis venenatis tellus leo at lacus.</p>\n" +
                "                            </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                </div>\n" +
                "            </div>\n" +
                "            <div class=\"col-md-4\">\n" +
                "                <h1>"+book.getPrice()+" zł</h1>\n" +
                "                <form class=\"g-3\">\n" +
                "                    <div class=\"mt-4\">\n" +
                "                        <button data-bookid="+book.getId()+" type=\"button\" class=\"btn btn-success btn-addtocart\" data-bs-toggle=\"modal\" data-bs-target=\"#order\">\n" +
                "                           Dodaj do koszyka\n" +
                "                        </button>\n" +
                "                    </div>\n" +
                "                </form>\n" +
                "                <h2>Dostawa w ciągu 3 dni roboczych!</h2>\n" +
                "                <h3>Koszt dostawy: 0 zł</h3>\n" +
                "            </div>\n" +
                "        </div>\n" +
                "    </div>\n";
    }
}
