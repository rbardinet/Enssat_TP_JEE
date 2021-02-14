<%@ page language="java"%>
<%@page import="java.util.Date"%>

<%

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

</body>

</html>
