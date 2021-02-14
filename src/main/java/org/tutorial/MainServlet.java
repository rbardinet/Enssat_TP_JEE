package org.tutorial;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends javax.servlet.http.HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doProcess(request,response);

    }


    private void doProcess(HttpServletRequest request, HttpServletResponse response) {

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
