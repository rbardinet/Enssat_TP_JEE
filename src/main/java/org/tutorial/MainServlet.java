package org.tutorial;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

public class MainServlet extends javax.servlet.http.HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            doProcess(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            doProcess(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    private void doProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {

        BookService bookService = new BookServiceImpl();

        List<Book> listBooks = bookService.getAllBooks();

        request.setAttribute("listBooks",listBooks);

        String pageName="/accueil.jsp";

        RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);

        try {

            rd.forward(request, response);

        } catch (ServletException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}
