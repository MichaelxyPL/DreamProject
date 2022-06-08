package com.DreamProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/register")
public class Register  extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Login login=new Login(
            request.getParameter("name"),
            request.getParameter("surname"),
            request.getParameter("email"),
            request.getParameter("password")
        );

        //TODO Test zapisu objektu w sesji jako zalogowany user
        /*User user = new User();
        user.setName("dupa");
        request.getSession().setAttribute("user", user);*/

        MainDAO db = new MainDAO();
        db.addUser(login);

        RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }
}
