<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@page import="classes.Conta_Instancias"%>
<%@page import="classes.Aluno"%>
<html>
<head>
<title>saveName</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body>

<%
   String name = request.getParameter( "userName" );
   session.setAttribute( "theName", name );
   out.println(name);
%>

<p>&nbsp;</p>
<p>P&aacute;gina solicitada por <%= session.getAttribute( "theName" ) %></p>

<p>
  <A HREF="nextPage.jsp">Continue</A>
</p>

</body>
</html>
