<%@ page language="java"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.List,org.tutorial.Book"%>

<%

    List<Book> listBooks = (List<Book>)request.getAttribute("listBooks");


    String myParameter=request.getParameter("param");

    Date now = new Date();

%>
<html>

<head>

    <title>ACCEUIL ACCEUIL ACCEUIL ACCEUIL ACCEUIL </title>

</head>

<body>

<h1>BODY BODY BODY</h1>
<p>Valeur du paramètre : <%=myParameter %></p>

<p>Date de la requête : <%=now.toString() %></p>

liste des livres :

<table border="1">

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
