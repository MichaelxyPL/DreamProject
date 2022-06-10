package com.DreamProject.patternStrategy;

import com.DreamProject.Book;

public class TemplateAudiobook implements ProductTempate {
    @Override
    public String showProductBox(Book book) {
        return "<div class=\"u-layout-row\">\n" +
                "                <div class=\"container text-white\" style=\"background-color: #5d0569;\">\n" +
                "        <div class=\"row pt-4 mb-4\">\n" +
                "            <div class=\"col-md-8 pt-3 rounded\" style=\"background-color: rgb(255 255 255 / 30%);\">\n" +
                "                <div class=\"card bg-transparent border-0\">\n" +
                "                    <div class=\"row\">\n" +
                "                        <div class=\"col-md-4 mb-4\">\n" +
                "                            <img src=\"https://www.publio.pl/files/product/product_w320/b0/9a/34/1015472-gate-janusz-leon-wisniewski-1.jpg?v=2809104\" class=\"img-thumbnail\" alt=\"...\">\n" +
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
                "                        <button class=\"btn btn-primary\" type=\"submit\">Pobierz</button>\n" +
                "                    </div>\n" +
                "                </form>\n" +
                "                <h2>Dostępne Online!</h2>\n" +
                "            </div>\n" +
                "        </div>" +
                "        </div>\n" +
                "    </div>\n";
    }
}
