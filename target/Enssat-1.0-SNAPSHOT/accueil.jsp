<%--
  Created by IntelliJ IDEA.
  User: rkbcht
  Date: 2/20/2021
  Time: 4:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.List,org.tutorial.Book"%>

<%

    List<Book> listBooks = (List<Book>)request.getAttribute("listBooks");

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LeTitre</title>
</head>
<body>
    <h1>accueil</h1>
    liste des livres :

    <table border="3">

        <tr>

            <th>Titre</th>

            <th>Auteur</th>

        </tr>

        <%

            for (Book book:listBooks) {

                String title = book.getTitle();

                String author = book.getAuthor();

        %>

        <tr>

            <td><%=title %></td>

            <td><%=author %></td>

        </tr>

        <%

            }

        %>

    </table>
</body>
</html>
