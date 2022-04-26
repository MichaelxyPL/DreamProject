package com.example.DreamProjct;

public class PageBuilder {
    public String makeHeader(){
        return"";
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

    public String makeFooter(){
        return"";
    }

    public String showProducts() {
        MainDAO db=new MainDAO();
        Book[] books=db.getBooks();
        String productSet = ""+books.length;
        for(int i = 0; i<books.length; i++){
            productSet+=showProduct(books[i]);
        }

        return productSet;
//        return "aaaaaaaaa";
    }
}
