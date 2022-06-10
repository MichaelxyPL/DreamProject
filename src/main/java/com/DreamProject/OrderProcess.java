package com.DreamProject;

        import javax.servlet.RequestDispatcher;
        import javax.servlet.ServletException;
        import javax.servlet.ServletRequest;
        import javax.servlet.ServletResponse;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import javax.servlet.http.HttpSession;
        import java.io.IOException;
        import java.util.Enumeration;

@WebServlet("/addOrder")
public class OrderProcess extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();
        Login login = (Login)session.getAttribute("login");

        if(!login.checkIsLogged()){
            RequestDispatcher dispatcher=request.getRequestDispatcher("register.jsp");
            dispatcher.forward(request,response);
        }

        MainDAO db = new MainDAO();
        db.addOrder(login, request.getParameter("bookid"),request.getParameter("amount"),request.getParameter("address"));

        RequestDispatcher dispatcher=request.getRequestDispatcher("history.jsp");
        dispatcher.forward(request,response);
    }
}

