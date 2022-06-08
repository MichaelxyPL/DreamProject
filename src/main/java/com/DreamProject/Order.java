package com.DreamProject;
//TODO zapis zmaówienia, wyświetlanie zamówień
public class Order {
    public String newOrder(){
        return "<button type=\"button\" class=\"btn btn-success\" data-bs-toggle=\"modal\" data-bs-target=\"#order\">\n" +
                "    Dodaj do koszyka\n" +
                "</button>\n" +
                "<div class=\"modal fade\" id=\"order\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\n" +
                "    <div class=\"modal-dialog\">\n" +
                "        <div class=\"modal-content\">\n" +
                "            <div class=\"modal-header\">\n" +
                "                <h4 class=\"modal-title text-center\">Zamówienie</h4>\n" +
                "                <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\"></button>\n" +
                "            </div>\n" +
                "            <form>\n" +
                "                <div class=\"modal-body\">\n" +
                "                    <div class=\"mb-3 mt-3\">\n" +
                "                        <label for=\"adres\" class=\"form-label\">Adres:</label>\n" +
                "                        <input type=\"text\" class=\"form-control\" id=\"adres\" placeholder=\"Wprowadź adres\" name=\"adres\">\n" +
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
}
