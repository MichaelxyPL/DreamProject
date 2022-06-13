package com.DreamProject;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet("/loginAuth")
public class LoginAuthorization extends HttpServlet {

    private static final long serialVersionUID= 1917533526447307385L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Login login=new Login();
        login.setEmail(request.getParameter("email"));
        login.setPassword(request.getParameter("password"));

        MainDAO db = new MainDAO();
        login=db.loginUser(login);

        System.out.println(login.getName());


        request.getSession().setAttribute("login", login);



        RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request,response);
    }
}

