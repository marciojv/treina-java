<%@ page contentType="text/html; charset=UTF-8" language="java" import="java.util.*" errorPage="" %>
<%@ page import="classes.Aluno" %>

<html>
<head>
<title>Declara&ccedil;&otilde;es... cuidado!</title>
</head>

<body>
<%! Date data = new Date();
    String aluno = "Marcio"; %>

<p>&nbsp;</p>
<p><font color="blue" size="+2">Essa p&aacute;gina foi acessada em<br></font> 
<%= data %></p>

<%= aluno %>
</body>
</html>
