<%@ page import = "classes.Aluno" %>
<jsp:useBean id="aluno" class="classes.Aluno" scope="session"/>
<jsp:setProperty name="aluno" property="nome"  />
<jsp:setProperty name="aluno" property="matricula"  />
<jsp:setProperty name="aluno" property="idade" value="32"  />

<html>
<head>
<title>Saves the data coming from getData page</title>
</head>
<% aluno.setNome("Marcio");
   aluno.setMatricula(100);
   %>
<BODY>
<A HREF="showData.jsp">Continue</A>
</BODY>
</HTML>