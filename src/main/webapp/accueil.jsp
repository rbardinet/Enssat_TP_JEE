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
    String nbRes = listBooks.get(listBooks.size()-1).getTitle();

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LeTitre</title>
</head>
<body>
    <h1>accueil</h1>

    <form action="MainServlet" method="post">
        <div>
            <label for="titre">Entrez un titre :</label>
            <input type="text" id="titre" name="searchTitre">
        </div>
        <div>
            <label for="auteur">Entrez un auteur :</label>
            <input type="text" id="auteur" name="searchAut">
        </div>
        <div class="button">
            <button type="submit">Rechercher</button>
        </div>
    </form>

    liste des livres (<%=nbRes %> résultat.s):

    <table border="3">

        <tr>

            <th>Titre</th>

            <th>Auteur</th>

        </tr>

        <%

            for (int i = 0; i < listBooks.size()-1; i++) {

                String title = listBooks.get(i).getTitle();

                String author = listBooks.get(i).getAuthor();

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
