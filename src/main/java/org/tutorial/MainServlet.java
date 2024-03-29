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

        List<Book> listBooks = listBooks = bookService.getAllBooks();

        String pageName="/accueil.jsp";

        RequestDispatcher rd = getServletContext().getRequestDispatcher(pageName);

        try {
            String searchTitre = (String) request.getParameter("searchTitre");
            String searchAut = (String) request.getParameter("searchAut");
            System.out.println("your key word Titre = "+searchTitre);
            System.out.println("your key word Aut = "+searchAut);

            if(searchTitre != null && searchAut != null){
                if (searchTitre.isEmpty() && searchAut.isEmpty()) {
                    listBooks = bookService.getAllBooks();
                }else if(searchAut.isEmpty()){
                    listBooks = bookService.getBooksByTitle(searchTitre);
                }else {
                    listBooks = bookService.getBooksByAut(searchAut);
                }
            }

            request.setAttribute("listBooks",listBooks);
            rd.forward(request, response);

        } catch (ServletException | IOException e) {

            e.printStackTrace();

        }

    }
}
